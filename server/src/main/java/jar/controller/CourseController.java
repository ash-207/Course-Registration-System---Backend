package jar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jar.model.Course;
import jar.service.CourseService;


@RestController
@RequestMapping("/courses")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping
    public Course addCourse(@RequestBody Course c){
        return service.save(c);
    }

    @GetMapping
    public List<Course> getCourses(){
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        service.delete(id);
    }
}

