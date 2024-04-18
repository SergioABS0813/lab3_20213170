package com.example.lab3.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "diagnostico", nullable = false)
    private String diagnostico;

    @Column(name = "fecha_cita", nullable = false)
    private Date fecha_cita;

    @Column(name = "numero_consultorio", nullable = false)
    private int numero_consultorio;

    @Column(name = "veterinario_id", nullable = false)
    private int veterinario_id;

    @Column(name = "sede_id", nullable = false)
    private int sede_id;
}
