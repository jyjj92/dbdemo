package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.primary.dto.Employee;
import com.example.primary.repo.EmployeeRepository;
import com.example.secondary.dto.Pet;
import com.example.secondary.repo.PetRepository;

@RestController
public class Controller {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot rds demo!!";
    }

    @PostMapping("/test")
    public String testDatabases() {
        Employee employee = new Employee();
        employee.setName("Test Primary");
        employee.setAddress("Test Address");
        employee.setRole("Test Role");

        employeeRepository.save(employee);

        Pet pet = new Pet();
        pet.setName("Test Secondary");
        pet.setAddress("Test Secondary");
        pet.setType("Test Pet");

        petRepository.save(pet);

        return "Data saved successfully!";
    }

}
