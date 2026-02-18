package jar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jar.model.Enrollment;
import jar.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repo;

    public Enrollment enroll(Enrollment e){
        return repo.save(e);
    }
}
