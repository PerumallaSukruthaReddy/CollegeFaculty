package com.example.CollegeFaculty.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="college")
public class College {
    @Id
    @Generated
    public int collegeId;
    public String collegeName;

    @OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    public List<Department> department;


    public void setName(String name) {
    }
}
