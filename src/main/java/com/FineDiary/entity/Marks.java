package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE marks (id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, studentId INTEGER NOT NULL, subjectId INTEGER NOT NULL, date TEXT NOT NULL, MARK INTEGER NOT NULL);

@Entity
@Table(name = "marks")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "studentId", nullable = false)
    private int studentId;

    @Column(name = "subjectId", nullable = false)
    private int subjectId;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "mark", nullable = false)
    private int mark;

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

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", subjectId=" + subjectId +
                ", date='" + date + '\'' +
                ", mark=" + mark +
                '}';
    }

}
