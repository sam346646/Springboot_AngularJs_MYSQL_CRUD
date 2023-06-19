package com.sam.employee.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private String email;

    private String jobtitle;

    private String phone;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(Long id, String name, String email, String jobtitle, String phone, String imageUrl,
            String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Employee() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtitle() {
        return this.jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", jobtitle='" + getJobtitle() + "'" +
                ", phone='" + getPhone() + "'" +
                ", imageUrl='" + getImageUrl() + "'" +
                ", employeeCode='" + getEmployeeCode() + "'" +
                "}";
    }

}