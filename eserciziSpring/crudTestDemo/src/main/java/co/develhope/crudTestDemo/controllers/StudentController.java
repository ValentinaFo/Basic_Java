package co.develhope.crudTestDemo.controllers;

import co.develhope.crudTestDemo.entities.Student;
import co.develhope.crudTestDemo.repositories.StudentRepository;
import co.develhope.crudTestDemo.services.StudentService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentService studentService;


//(1) per creare un nuovo Student
    @PostMapping("/")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }


//  (2) per ottenere la lista di tutti gli Student
    @GetMapping("/list")
    public List<Student> getList(){
    return studentRepository.findAll();
    }


//(3) per prendere uno Student specifico passando primary key come path variable
    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable long id){
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }


//(4) per aggiornare uno Student:
//    passando primary key come path variable
//    passando Student in request body *aggiornando il name e il surname
    @PutMapping("/{id}")
    public void updateStudent(@PathVariable long id, @RequestBody Student student){
        student.setName(student.getName());
        student.setSurname(student.getSurname());
        studentRepository.save(student);
    }

//(5) per aggiornare il valore isWorking value:
//    passando primary key come path variable
//    passando request param con nome working
    @PutMapping("/{id}/working")
    public void setStudentWorking(@PathVariable long id, @RequestParam("isWorking") boolean isWorking){
        studentService.setStudentWorkStatus(id,isWorking);

    }

//(6) per cancellare uno Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id){
        studentRepository.deleteById(id);
    }
}
