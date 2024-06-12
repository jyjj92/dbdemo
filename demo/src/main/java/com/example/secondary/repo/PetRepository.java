package com.example.secondary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.secondary.dto.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, String> {
}