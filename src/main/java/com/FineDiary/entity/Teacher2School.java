package com.FineDiary.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher2school")
public class Teacher2School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "teacherId")
    private int teacherId;

    @Column(name = "schoolId")
    private int schoolId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Teacher2School{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", schoolId=" + schoolId +
                '}';
    }
}
