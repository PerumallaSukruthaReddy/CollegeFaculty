package com.example.CollegeFaculty.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @Generated
    public  Long id;
    public String name;



    @ManyToOne
    @JoinColumn(name = "college_id")
    public College college;

}
