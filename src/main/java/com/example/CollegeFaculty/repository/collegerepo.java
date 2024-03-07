package com.example.CollegeFaculty.repository;

import com.example.CollegeFaculty.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface collegerepo extends JpaRepository<College, Long> {
    College findByName(String name);


}
