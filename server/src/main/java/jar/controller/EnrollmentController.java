package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jar.model.Enrollment;
import jar.service.EnrollmentService;

@RestController
@RequestMapping("/enroll")
@CrossOrigin
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @PostMapping
    public Enrollment enrollStudent(@RequestBody Enrollment e){
        return service.enroll(e);
    }
}
