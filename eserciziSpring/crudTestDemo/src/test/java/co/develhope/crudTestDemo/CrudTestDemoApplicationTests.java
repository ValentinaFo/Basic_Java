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
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest
@ActiveProfiles({"test"})
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

	CrudTestDemoApplicationTests() {
	}

	@Test
	@Order(2)
	public void getAllstudentsAPI() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/student", new Object[0]).accept(new MediaType[]{MediaType.APPLICATION_JSON})).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$[?(@.id)]", new Object[0]).exists());
	}

	@Test
	@Order(3)
	public void getStudentByIdAPI() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/student/{id}", new Object[]{1}).accept(new MediaType[]{MediaType.APPLICATION_JSON})).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$([*].id)", new Object[]{1}).exists());
	}

	@Test
	@Order(1)
	void createStudent() throws JsonProcessingException {
		Student student = new Student();
		student.setWorking(true);
		student.setName("Valentina");
		student.setSurname("Foti");
		String studentJson = this.objectMapper.writeValueAsString(student);

		try {
			this.mockMvc.perform(MockMvcRequestBuilders.post("/student", new Object[0]).content(studentJson).contentType(MediaType.APPLICATION_JSON).accept(new MediaType[]{MediaType.APPLICATION_JSON})).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception var4) {
			Exception e = var4;
			throw new RuntimeException(e);
		}
	}
}
