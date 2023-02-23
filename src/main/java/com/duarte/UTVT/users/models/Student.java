package com.duarte.UTVT.users.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "gender", nullable = false, length = 50)
    private Integer gender;

    @Column(name = "createdAt", nullable = false, length = 50)
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
