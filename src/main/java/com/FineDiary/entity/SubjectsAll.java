package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE subjectsAll (id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, subject VARCHAR(20) NOT NULL);

@Entity
@Table(name = "subjectsAll")
public class SubjectsAll {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "subject", nullable = false)
    private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "SubjectsAll{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}
