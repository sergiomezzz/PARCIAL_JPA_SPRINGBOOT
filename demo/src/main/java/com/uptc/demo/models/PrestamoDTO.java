package com.uptc.demo.models;

public class PrestamoDTO {
    private Long usiarioId;
    private Long recursoBibliograficoId;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public PrestamoDTO() {}

    public PrestamoDTO(Long usiarioId, Long recursoBibliograficoId, String fechaPrestamo, String fechaDevolucion) {
        this.usiarioId = usiarioId;
        this.recursoBibliograficoId = recursoBibliograficoId;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getUsiarioId() {
        return usiarioId;
    }

    public void setUsiarioId(Long usiarioId) {
        this.usiarioId = usiarioId;
    }

    public Long getRecursoBibliograficoId() {
        return recursoBibliograficoId;
    }

    public void setRecursoBibliograficoId(Long recursoBibliograficoId) {
        this.recursoBibliograficoId = recursoBibliograficoId;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
