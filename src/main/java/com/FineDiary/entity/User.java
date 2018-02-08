package com.FineDiary.entity;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;



@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

    @Column(name = "EMAIL",nullable = false,unique = true)
    private String email;

    @Column (name = "NAME",nullable = false)
    private String name;

    @Column(name = "LASTNAME",nullable = false)
    private String lastName;

    @Column(name = "ROLE",nullable = false)
    private String role;

    @Column(name = "SURNAME",nullable = false)
    private String surrName;

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordDecoded(){
        byte[] decoded = Base64.getDecoder().decode(password);
        String str = new String(decoded, StandardCharsets.UTF_8);
        return str;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSurrName() {
        return surrName;
    }

    public void setSurrName(String surrName) {
        this.surrName = surrName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
