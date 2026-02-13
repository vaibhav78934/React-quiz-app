package com.example.javaportalapplication.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.javaportalapplication.model.Application;
import com.example.javaportalapplication.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }
}
