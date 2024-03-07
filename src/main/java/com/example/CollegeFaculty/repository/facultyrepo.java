package com.example.CollegeFaculty.repository;

import com.example.CollegeFaculty.model.Department;
import com.example.CollegeFaculty.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.ByteBuffer;
import java.util.List;

public interface facultyrepo extends JpaRepository<Faculty, Long> {
    static List<Faculty> findByDepartmentName(String departmentName) {
        return null;
    }

    static Faculty Save(Faculty faculty) {
        return faculty;
    }

    static List<Faculty> FindAll() {
        return null;
    }

    static ByteBuffer FindById(int id) {
        return null;
    }

    List<Faculty> findByCollegeName(String collegeName);
}
