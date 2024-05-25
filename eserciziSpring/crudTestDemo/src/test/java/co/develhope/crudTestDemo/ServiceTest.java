package co.develhope.crudTestDemo;

import co.develhope.crudTestDemo.entities.Student;
import co.develhope.crudTestDemo.repositories.StudentRepository;
import co.develhope.crudTestDemo.services.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.modelmapper.ModelMapper;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import static org.hamcrest.Matchers.any;
import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private StudentService studentService;

    @Mock
    private ModelMapper mapper;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void testUpdateIsWorking() {
        Student u = new Student();
        u.setId(1L);
        u.setName("Vale");
        u.setSurname("Foti");
        u.setWorking(true);
        when(studentRepository.findById(1L)).thenReturn(Optional.of(u));
        when(studentRepository.saveAndFlush(ArgumentMatchers.any(Student.class))).thenReturn(u);
        Student updated = studentService.isWorkingSwitch(1L, false);
        assertEquals(false, updated.getIsWorking());
    }

}
