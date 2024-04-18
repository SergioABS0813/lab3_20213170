package com.example.lab3.Repository;

import com.example.lab3.Entity.Mascota;
import com.example.lab3.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

}
