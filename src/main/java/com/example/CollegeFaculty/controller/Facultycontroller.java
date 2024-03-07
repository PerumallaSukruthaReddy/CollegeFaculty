package com.example.CollegeFaculty.controller;

import com.example.CollegeFaculty.model.Faculty;
import com.example.CollegeFaculty.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class Facultycontroller {
    @Autowired
    private Facultyservice facultyService;
    public Facultycontroller(Facultyservice facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        Faculty createdFaculty = facultyService.addFaculty(faculty);
        return new ResponseEntity<>(createdFaculty, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Faculty>> getAllFaculties() {
        List<Faculty> faculties = facultyService.getAllFaculties();
        return new ResponseEntity<>(faculties, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Faculty> getFacultyById(@PathVariable int id) {
        Faculty faculty = facultyService.getFacultyById(id);
        return new ResponseEntity<>(faculty, HttpStatus.OK);
    }

    @GetMapping("/department/{departmentName}")
    public ResponseEntity<List<Faculty>> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        List<Faculty> faculties = facultyService.getFacultiesByDepartmentName(departmentName);
        return new ResponseEntity<>(faculties, HttpStatus.OK);
    }

}

