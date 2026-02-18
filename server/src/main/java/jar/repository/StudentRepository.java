package jar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jar.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
