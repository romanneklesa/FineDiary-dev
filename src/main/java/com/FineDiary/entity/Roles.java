package com.FineDiary.entity;

import javax.persistence.*;

//CREATE TABLE roles (id INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT, role VARCHAR(15) NOT NULL);

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "role")
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
