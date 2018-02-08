package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE classes (id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, schoolId INTEGER NOT NULL, curatorId INTEGER NOT NULL, year VARCHAR(5) NOT NULL, letter CHAR(1) NOT NULL);

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "schoolId", nullable = false)
    private int schoolId;

    @Column(name = "curatorId", nullable = false)
    private int curatorId;

    @Column(name = "year", nullable = false)
    private byte year;

    @Column(name = "letter", nullable = false)
    private Character letter;


    /* Getters */

    public int getId() {
        return id;
    }
    public int getSchoolId() {
        return schoolId;
    }
    public int getCuratorId() {
        return curatorId;
    }
    /* Year+letter like 11-A, 6-B */
    public Byte getYear() {
        return year;
    }
    public Character getLetter() {
        return letter;
    }
    /* Setters */
    public void setId(int id) {
        this.id = id;
    }
    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
    public void setCuratorId(int curatorId) {
        this.curatorId = curatorId;
    }
    public void setYear(Byte year) {
        this.year = year;
    }
    public void setLetter(Character letter) {
        this.letter = letter;
    }


    /* Constructor */
    public Classes() {

    }

    public Classes(int schoolId, int curatorId, Byte year, Character letter) {
        this.schoolId = schoolId;
        this.curatorId = curatorId;
        this.year = year;
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", schoolId=" + schoolId +
                ", curatorId=" + curatorId +
                ", year=" + year +
                ", letter=" + letter +
                '}';
    }
}
