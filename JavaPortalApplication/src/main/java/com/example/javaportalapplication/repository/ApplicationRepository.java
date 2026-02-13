package com.example.javaportalapplication.repository;

import com.example.javaportalapplication.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
