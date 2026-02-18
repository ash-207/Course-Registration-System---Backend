package jar.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.model.Student;
import jar.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student save(Student s){
        return repo.save(s);
    }

    public List<Student> getAll(){
        return repo.findAll();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }

}
