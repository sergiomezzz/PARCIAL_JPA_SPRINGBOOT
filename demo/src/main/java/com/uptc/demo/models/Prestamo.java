package com.uptc.demo.models;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_prestamo")
    private LocalDate fechaPrestamo;

    @Column(name = "fecha_devolucion")
    private LocalDate fechaDevolucion;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usiario_id")
    private Usiario usiario;

    @ManyToOne
    @JoinColumn(name = "recurso_bibliografico_id")
    private RecursoBibliografico recursoBibliografico;

    public Prestamo() {}

    public Prestamo(Long id, LocalDate fechaPrestamo, LocalDate fechaDevolucion, String estado) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usiario getUsiario() {
        return usiario;
    }

    public void setUsiario(Usiario usiario) {
        this.usiario = usiario;
    }

    public RecursoBibliografico getRecursoBibliografico() {
        return recursoBibliografico;
    }

    public void setRecursoBibliografico(RecursoBibliografico recursoBibliografico) {
        this.recursoBibliografico = recursoBibliografico;
    }
}
