package com.example.CollegeFaculty.service;

import com.example.CollegeFaculty.model.Department;
import com.example.CollegeFaculty.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class Departmentservice {
    @Autowired
    public final departmentrepo departmentRepository;

    public Departmentservice(departmentrepo departmentRepo) {
        this.departmentRepository = departmentRepo;
    }


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollegeName(collegeName);
    }

    public void assignFacultyToDepartment(Long departmentId, Long facultyId) {
    }

}









