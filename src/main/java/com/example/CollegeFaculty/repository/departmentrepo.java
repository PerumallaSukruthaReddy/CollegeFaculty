package com.example.CollegeFaculty.repository;

import com.example.CollegeFaculty.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface departmentrepo extends JpaRepository<Department, Long> {
    List<Department> findByCollegeName(String collegeName);

}
