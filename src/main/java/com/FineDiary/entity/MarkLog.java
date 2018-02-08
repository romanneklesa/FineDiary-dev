package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE markLog (markId INTEGER NOT NULL, note TEXT);

@Entity
@Table(name = "markLog")
public class MarkLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "markId", nullable = false)
    public int markId;

    @Column(name = "note")
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "MarkLog{" +
                "id=" + id +
                ", markId=" + markId +
                ", note='" + note + '\'' +
                '}';
    }
}











