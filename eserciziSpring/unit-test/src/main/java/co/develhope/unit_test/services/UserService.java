package co.develhope.unit_test.services;


import co.develhope.unit_test.dto.UserDTO;
import co.develhope.unit_test.entities.User;
import co.develhope.unit_test.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo studentRepo;
    @Autowired
    private ModelMapper mapper;

    public UserDTO createUser (UserDTO user){
        User entity = mapper.map(user, User.class);
        User saved = studentRepo.saveAndFlush(entity);
        mapper.map(user, saved);
        user.setId(saved.getId());
        return user;
    }
    public User findById (Long id){
        return studentRepo.findById(id).orElse(null);
    }
    public List<User> findALl (){
        return studentRepo.findAll();
    }
    public User updateUser(Long id, UserDTO user){
        User findedUser = studentRepo.findById(id).orElse(null);
        findedUser.setName(user.getName());
        findedUser.setSurname(user.getSurname());
        studentRepo.saveAndFlush(findedUser);
        return  findedUser;
    }
    public void deleteUser(Long id){
        studentRepo.deleteById(id);
    }
}