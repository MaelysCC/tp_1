package fr.takima.training.simpleapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.takima.training.simpleapi.entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {
    List<Student> findStudentsByDepartment_Name(String departmentName);
    int countAllByDepartment_Name(String departmentName);
    Student findById(long id);
}
