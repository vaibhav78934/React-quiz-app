package com.example.javaportalapplication.model;

import jakarta.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicantName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    // GETTERS

    public Long getId() { return id; }
    public String getApplicantName() { return applicantName; }
    public String getEmail() { return email; }
    public Job getJob() { return job; }

    // SETTERS

    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }
    public void setEmail(String email) { this.email = email; }
    public void setJob(Job job) { this.job = job; }
}
