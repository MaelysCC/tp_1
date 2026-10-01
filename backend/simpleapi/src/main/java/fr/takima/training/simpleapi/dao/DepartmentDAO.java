package fr.takima.training.simpleapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.takima.training.simpleapi.entity.Department;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Long> {
    Department findDepartmentByName(String name);
}
