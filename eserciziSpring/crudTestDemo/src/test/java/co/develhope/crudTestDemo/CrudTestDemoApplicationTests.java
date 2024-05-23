package co.develhope.crudTestDemo;

import co.develhope.crudTestDemo.controllers.StudentController;
import co.develhope.crudTestDemo.entities.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class CrudTestDemoApplicationTests {
	@Autowired
	private StudentController studentController;
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	}
	@Test
	void createStudent() throws JsonProcessingException {
		Student student = new Student();
		student.setWorking(true);
		student.setName("Valentina");
		student.setSurname("Foti");

		}

}
