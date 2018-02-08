package com.FineDiary.entity;


import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "COLUMNTEST")
    private String columnTest;

    @Column(name = "TEST")
    private String test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColumnTest() {
        return columnTest;
    }

    public void setColumnTest(String columnTest) {
        this.columnTest = columnTest;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", columnTest='" + columnTest + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
