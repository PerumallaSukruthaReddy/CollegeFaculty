package com.example.CollegeFaculty.service;

import com.example.CollegeFaculty.model.Faculty;
import com.example.CollegeFaculty.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Facultyservice {
    @Autowired
    public final facultyrepo facultyRepository;
    public Facultyservice(facultyrepo facultyRepo) {
        this.facultyRepository= facultyRepo;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyrepo.Save(faculty);
    }

    public List<Faculty> getAllFaculties() {
        return facultyrepo.FindAll();
    }
    public List<Faculty> getFacultiesByCollegeName(String collegeName) {
        return facultyRepository.findByCollegeName(collegeName);
    }

    public List<Faculty> getFacultiesByDepartmentName(String departmentName) {
        return facultyrepo.findByDepartmentName(departmentName);
    }
    public Faculty getFacultyById(int id) {

        return null;
    }
}


