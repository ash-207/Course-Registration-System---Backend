package jar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jar.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
