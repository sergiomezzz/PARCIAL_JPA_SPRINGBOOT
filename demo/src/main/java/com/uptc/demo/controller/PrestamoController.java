package com.uptc.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uptc.demo.models.Prestamo;
import com.uptc.demo.services.PrestamoServices;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {
    @Autowired
    private PrestamoServices prestamoServices;

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
    public void save(@RequestBody Prestamo prestamo) {
        prestamoServices.save(prestamo);
    }
}
