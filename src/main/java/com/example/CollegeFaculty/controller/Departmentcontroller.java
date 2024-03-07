package com.example.CollegeFaculty.controller;

import com.example.CollegeFaculty.model.Department;
import com.example.CollegeFaculty.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    public  Departmentservice departmentservice;

    @Autowired
    public Departmentcontroller(Departmentservice departmentService) {
        this.departmentservice = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department createdDepartment = departmentservice.addDepartment(department);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentservice.getAllDepartments();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Department department = departmentservice.getDepartmentById(id);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @GetMapping("/college/{collegeName}")
    public ResponseEntity<List<Department>> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        List<Department> departments = departmentservice.getDepartmentsByCollegeName(collegeName);
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @PostMapping("/{departmentId}/assignFaculty/{facultyId}")
    public ResponseEntity<Void> assignFacultyToDepartment(@PathVariable Long departmentId, @PathVariable Long facultyId) {
        departmentservice.assignFacultyToDepartment(departmentId, facultyId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

