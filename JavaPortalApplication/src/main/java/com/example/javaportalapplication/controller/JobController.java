package com.example.javaportalapplication.controller;

import com.example.javaportalapplication.model.Job;
import com.example.javaportalapplication.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    // =======================
    // VIEW JOBS
    // =======================
    @GetMapping("/jobs")
    public String viewJobs(
            @RequestParam(value = "keyword", required = false) String keyword,
            Model model) {

        List<Job> jobs;

        if (keyword != null && !keyword.isEmpty()) {
            jobs = jobRepository.findByTitleContainingIgnoreCase(keyword);
        } else {
            jobs = jobRepository.findAll();
        }

        model.addAttribute("jobs", jobs);
        return "jobs";
    }

    // =======================
    // APPLY JOB
    // =======================
    @GetMapping("/apply/{id}")
    public String applyJob(@PathVariable Long id, Model model) {

        Job job = jobRepository.findById(id).orElse(null);

        if (job == null) {
            return "redirect:/jobs";
        }

        model.addAttribute("job", job);
        return "apply";
    }
}
