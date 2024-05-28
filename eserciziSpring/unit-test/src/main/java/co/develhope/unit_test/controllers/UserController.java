package co.develhope.unit_test.controllers;

import co.develhope.unit_test.dto.UserDTO;
import co.develhope.unit_test.entities.User;
import co.develhope.unit_test.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    public UserDTO createUser(@RequestBody UserDTO user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user=  userService.findById(id);
        if(user != null){
            return user;
        }else{
            return null;
        }
    }
    @GetMapping("/list")
    public List<User> findAll(){
        return userService.findALl();
    }
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody UserDTO user){
        if(user != null){
            return userService.updateUser(id,user);
        }else{
            return null;
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "Utente " + id + " cancellato";
    }
}

