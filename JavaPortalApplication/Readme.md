# 🧑‍💼 Job Portal - Spring Boot (JWT Based)

A complete Role-Based Job Portal REST API built using **Spring Boot**, **Spring Security (JWT)**, **JPA + Hibernate**, and **MySQL**.

This project supports multiple user roles and secure authentication using JSON Web Tokens (JWT).

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## 👥 Roles

The system supports three roles:

- ADMIN
- EMPLOYER
- JOB_SEEKER

---

## 🔐 Authentication

- JWT Based Authentication
- Stateless Session Management
- Role-Based Authorization
- Password Encryption using BCrypt

---

## 📌 Features

- ✅ User Registration
- ✅ User Login (JWT Token Generation)
- ✅ Role-Based Access Control
- ✅ Post Job (EMPLOYER only)
- ✅ View All Jobs
- ✅ Apply for Job (JOB_SEEKER only)
- ✅ View Applications
- ✅ Admin Controls (Optional Extensions)

---

## 📂 Project Structure

jobportal
│
├── src/main/java/com/example/jobportal
│ │
│ ├── config
│ │ ├── SecurityConfig.java
│ │ ├── JwtAuthenticationFilter.java
│ │ └── JwtUtil.java
│ │
│ ├── controller
│ │ ├── AuthController.java
│ │ ├── JobController.java
│ │ └── ApplicationController.java
│ │
│ ├── service
│ │ ├── UserService.java
│ │ ├── JobService.java
│ │ └── ApplicationService.java
│ │
│ ├── repository
│ │ ├── UserRepository.java
│ │ ├── JobRepository.java
│ │ └── ApplicationRepository.java
│ │
│ ├── model
│ │ ├── User.java
│ │ ├── Role.java
│ │ ├── Job.java
│ │ └── Application.java
│ │
│ └── JobPortalApplication.java
│
├── src/main/resources
│ ├── application.properties
│
└── pom.xml



---

## 🗄️ Database Setup

### 1️⃣ Install MySQL

Make sure MySQL is running.

### 2️⃣ Create Database

```sql
CREATE DATABASE jobportal;
