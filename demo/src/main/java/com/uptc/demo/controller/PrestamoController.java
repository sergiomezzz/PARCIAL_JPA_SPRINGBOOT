package com.uptc.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uptc.demo.models.Prestamo;
import com.uptc.demo.models.PrestamoDTO;
import com.uptc.demo.services.PrestamoServices;
import com.uptc.demo.services.UsiarioServices;
import com.uptc.demo.services.RecursoBibliograficoServices;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {
    @Autowired
    private PrestamoServices prestamoServices;
    @Autowired
    private UsiarioServices usiarioServices;
    @Autowired
    private RecursoBibliograficoServices recursoBibliograficoServices;

    @GetMapping("/getAll")
    public List<Prestamo> getAll() {
        return prestamoServices.findAll();
    }

    @GetMapping("/getById/{id}")
    public Prestamo getById(@PathVariable Long id) {
        return prestamoServices.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        prestamoServices.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody PrestamoDTO prestamoDTO) {
        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(LocalDate.parse(prestamoDTO.getFechaPrestamo()));
        prestamo.setFechaDevolucion(LocalDate.parse(prestamoDTO.getFechaDevolucion()));
        prestamo.setUsiario(usiarioServices.findById(prestamoDTO.getUsiarioId()));
        prestamo.setRecursoBibliografico(recursoBibliograficoServices.findById(prestamoDTO.getRecursoBibliograficoId()));
        prestamoServices.save(prestamo);
    }
}
