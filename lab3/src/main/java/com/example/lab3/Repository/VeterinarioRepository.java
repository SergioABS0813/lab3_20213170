package com.example.lab3.Repository;

import com.example.lab3.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
}
