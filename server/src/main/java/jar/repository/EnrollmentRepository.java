package jar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jar.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    
}
