package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE healthGroups (id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, name VARCHAR(15) NOT NULL);

@Entity
@Table(name = "healthGroups")
public class HealthGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "HEALSGROUP", nullable = false)
    private String healsGroup;


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

    public String getHealsGroup() {
        return healsGroup;
    }

    public void setHealsGroup(String healsGroup) {
        this.healsGroup = healsGroup;
    }

    /* Constructors */
    public HealthGroups() {
    }
    public HealthGroups(String name, String healsGroup) {
        this.name = name;
        this.healsGroup = healsGroup;
    }

    @Override
    public String toString() {
        return "HealthGroups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", healsGroup='" + healsGroup + '\'' +
                '}';
    }
}
