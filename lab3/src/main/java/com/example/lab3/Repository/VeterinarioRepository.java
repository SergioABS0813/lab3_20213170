package com.example.lab3.Repository;

import com.example.lab3.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
    List<Veterinario> findBySede_id(int id);
}
