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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getNumero_consultorio() {
        return numero_consultorio;
    }

    public void setNumero_consultorio(int numero_consultorio) {
        this.numero_consultorio = numero_consultorio;
    }

    public int getVeterinario_id() {
        return veterinario_id;
    }

    public void setVeterinario_id(int veterinario_id) {
        this.veterinario_id = veterinario_id;
    }

    public int getSede_id() {
        return sede_id;
    }

    public void setSede_id(int sede_id) {
        this.sede_id = sede_id;
    }
}
