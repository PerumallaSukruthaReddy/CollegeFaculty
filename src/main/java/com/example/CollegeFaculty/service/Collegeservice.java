package com.example.CollegeFaculty.service;

import com.example.CollegeFaculty.model.College;
import com.example.CollegeFaculty.repository.collegerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Collegeservice {
    @Autowired
    public collegerepo collegeRepository;

    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public College getCollegeByName(String name) {
        return collegeRepository.findByName(name);
    }

    public College updateCollegeName(Long id, String name) {
        College college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            college.setName(name);
            return collegeRepository.save(college);
        }
        return null;
    }

    public void deleteCollege(Long id) {

        collegeRepository.deleteById(id);
    }
}


