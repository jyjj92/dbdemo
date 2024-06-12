package com.example.primary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.primary.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}