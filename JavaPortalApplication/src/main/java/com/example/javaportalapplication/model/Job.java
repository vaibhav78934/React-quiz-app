package com.example.javaportalapplication.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String company;
    private String location;
    private Double salary;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<Application> applications;

    // GETTERS

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getCompany() { return company; }
    public String getLocation() { return location; }
    public Double getSalary() { return salary; }
    public List<Application> getApplications() { return applications; }

    // SETTERS

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setCompany(String company) { this.company = company; }
    public void setLocation(String location) { this.location = location; }
    public void setSalary(Double salary) { this.salary = salary; }
    public void setApplications(List<Application> applications) { this.applications = applications; }
}
