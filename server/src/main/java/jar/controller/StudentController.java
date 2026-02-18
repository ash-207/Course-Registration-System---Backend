package jar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin

public class StudentController {
    
    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return service.save(s);
    }


    @GetMapping
    public List<Student> getStudents()
    {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(Long id)
    {
        service.delete(id);
    }
}
