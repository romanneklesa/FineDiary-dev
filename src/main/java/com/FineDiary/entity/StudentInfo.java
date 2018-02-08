package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE studentInfo (studentId INTEGER NOT NULL, healthId INTEGER NOT NULL, archiveNumber TEXT NOT NULL);

@Entity
@Table(name = "studentInfo")
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "studentId", nullable = false)
    private int studentId;

    @Column(name = "healthId", nullable = false)
    private int healthId;

    @Column(name = "archiveNumber", nullable = false)
    private String archiveNumber;

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

    public int getHealthId() {
        return healthId;
    }

    public void setHealthId(int healthId) {
        this.healthId = healthId;
    }

    public String getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(String archiveNumber) {
        this.archiveNumber = archiveNumber;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", healthId=" + healthId +
                ", archiveNumber='" + archiveNumber + '\'' +
                '}';
    }
}
