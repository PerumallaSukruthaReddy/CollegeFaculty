package com.example.CollegeFaculty.controller;

import com.example.CollegeFaculty.model.College;
import com.example.CollegeFaculty.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class Collegecontroller {
    @Autowired
    public Collegeservice collegeService;

    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        College savedCollege = collegeService.addCollege(college);
        return new ResponseEntity<>(savedCollege, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        List<College> colleges = collegeService.getAllColleges();
        return new ResponseEntity<>(colleges, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
        College college = collegeService.getCollegeById(id);
        return ResponseEntity.ok(college);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
        College college = collegeService.getCollegeByName(name);
        return ResponseEntity.ok(college);
    }

    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollegeName(@PathVariable Long id, @RequestParam String newName) {
        College updatedCollege = collegeService.updateCollegeName(id, newName);
        return ResponseEntity.ok(updatedCollege);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
        return ResponseEntity.noContent().build();
    }

}
