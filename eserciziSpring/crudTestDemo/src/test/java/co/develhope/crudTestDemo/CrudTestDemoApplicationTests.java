package co.develhope.crudTestDemo;

import co.develhope.crudTestDemo.controllers.StudentController;
import co.develhope.crudTestDemo.entities.Student;
import co.develhope.crudTestDemo.repositories.StudentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CrudTestDemoApplicationTests {
	@Autowired
	private StudentController studentController;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private StudentRepository studentRepository;




//	https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockmvc-example/
//	https://howtodoinjava.com/spring-boot/spring-boot-rest-controller-example/


	@Test
	@Order(2)
	public void getAllstudentsAPI() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders
						.get("/student")
						.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$[?(@.id)]").exists());
//				.andExpect(MockMvcResultMatchers.jsonPath("$.student[*].studentId").isNotEmpty());
	}



	@Test
	@Order(3)
	public void getStudentByIdAPI() throws Exception
	{
		mockMvc.perform( MockMvcRequestBuilders
						.get("/student/{id}", 1)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$[*].id",1).exists());
	}
	@Test
	@Order(1)
	void createStudent() throws JsonProcessingException {
		Student student = new Student();
		student.setWorking(true);
		student.setName("Valentina");
		student.setSurname("Foti");

		String studentJson = objectMapper.writeValueAsString(student);
		try {
			this.mockMvc.perform(MockMvcRequestBuilders
							.post("/student")
							.content(studentJson)
							.contentType(MediaType.APPLICATION_JSON)
							.accept(MediaType.APPLICATION_JSON))
					.andDo(print())
					.andExpect(status().isOk());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


	}




}
