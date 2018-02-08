package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE subjects (subjectId INTEGER NOT NULL, classId INTEGER NOT NULL, teacherId INTEGER NOT NULL);

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "subjectId", nullable = false)
    private int subjectId;

    @Column(name = "classId", nullable = false)
    private int classId;

    @Column(name = "teacherId", nullable = false)
    private int teacherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", subjectId=" + subjectId +
                ", classId=" + classId +
                ", teacherId=" + teacherId +
                '}';
    }
}
