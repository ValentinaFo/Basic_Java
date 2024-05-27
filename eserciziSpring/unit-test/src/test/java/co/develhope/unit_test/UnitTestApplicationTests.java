package co.develhope.unit_test;

import co.develhope.unit_test.dto.UserDTO;
import co.develhope.unit_test.entities.User;
import co.develhope.unit_test.repositories.UserRepo;
import co.develhope.unit_test.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class UnitTestApplicationTests {
	@Autowired
	private UserService userService;

	@Mock
	private ModelMapper mapper;

	@MockBean
	private UserRepo userRepo;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreateStudent() {
		UserDTO u = new UserDTO();
		u.setId(1L);
		u.setName("Vale");
		u.setSurname("Foti");

		User user = new User();
		user.setId(1L);
		user.setName("Vale");
		user.setSurname("Foti");

		User saved = new User();
		saved.setId(1L);
		saved.setName("Vale");
		saved.setSurname("Foti");

		when(mapper.map(u, User.class)).thenReturn(user);
		when(userRepo.saveAndFlush(ArgumentMatchers.any(User.class))).thenReturn(saved);
		when(mapper.map(saved, UserDTO.class)).thenReturn(u);

		UserDTO created = userService.createUser(u);
		assertEquals("Vale", created.getName());
		assertEquals("Foti", created.getSurname());
	}

	@Test
	public void testGetStudentById() {
		User u = new User();
		u.setId(1L);
		u.setName("Vale");
		u.setSurname("Foti");
		when(userRepo.findById(1L)).thenReturn(Optional.of(u));
		User found = userService.findById(1L);
		assertEquals("Vale", found.getName());
	}

	@Test
	public void testUpdate() {
		User u = new User();
		u.setId(1L);
		u.setName("Vale");
		u.setSurname("Foti");

		UserDTO newUser = new UserDTO();
		newUser.setName("ciao");
		newUser.setSurname("ciao");

		when(userRepo.findById(1L)).thenReturn(Optional.of(u));
		when(userRepo.saveAndFlush(ArgumentMatchers.any(User.class))).thenReturn(u);
		User updated = userService.updateUser(1L, newUser);
		assertEquals("ciao", updated.getName());
		assertEquals("ciao", updated.getSurname());
	}
	@Test
	public void testDelete(){
		User u = new User();
		u.setId(1L);
		u.setName("Vale");
		u.setSurname("Foti");
		when(userRepo.findById(1L)).thenReturn(Optional.of(u));
		userService.deleteUser(1L);

	}

}
