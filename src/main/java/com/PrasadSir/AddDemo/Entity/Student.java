package com.PrasadSir.AddDemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentDemo")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)// It means the database column should not accept NULL values.
    private String name;

    @Column(nullable = false)
    private String schoolName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
