package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE parents (studentId INTEGER NOT NULL, fatherId INTEGER, motherId INTEGER);

@Entity
@Table(name = "parents")
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "studentId", nullable = false)
    private int studentId;

    @Column(name = "fatherId")
    private int fatherId;

    @Column(name = "motherId")
    private int motherId;


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

    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    public int getMotherId() {
        return motherId;
    }

    public void setMotherId(int motherId) {
        this.motherId = motherId;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", fatherId=" + fatherId +
                ", motherId=" + motherId +
                '}';
    }
}
