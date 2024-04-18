package com.example.lab3.Repository;

import com.example.lab3.Entity.Sede;
import com.example.lab3.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SedeRepository extends JpaRepository<Sede, Integer> {
}
