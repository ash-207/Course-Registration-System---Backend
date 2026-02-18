package jar.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jar.model.Course;
import jar.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public Course save(Course c){
        return repo.save(c);
    }

    public List<Course> getAll(){
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}
