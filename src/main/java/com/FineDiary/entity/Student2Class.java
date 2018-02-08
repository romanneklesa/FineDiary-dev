package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE student2class (studentId INTEGER NOT NULL, classId INTEGER NOT NULL);

@Entity
@Table(name = "student2class")
public class Student2Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "studentId", nullable = false)
    private int studentId;

    @Column(name = "classId", nullable = false)
    private int classId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student2Class{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", classId=" + classId +
                '}';
    }
}
