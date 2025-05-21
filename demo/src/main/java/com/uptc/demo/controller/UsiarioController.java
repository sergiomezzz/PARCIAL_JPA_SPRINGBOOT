package com.uptc.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uptc.demo.models.Usiario;
import com.uptc.demo.services.UsiarioServices;

@RestController
@RequestMapping("/api/usiario")
public class UsiarioController {
    @Autowired
    private UsiarioServices usiarioServices;

    @GetMapping("/getAll")
    public List<Usiario> getAll() {
        return usiarioServices.findAll();
    }

    @GetMapping("/getById/{id}")
    public Usiario getById(@PathVariable Long id) {
        return usiarioServices.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        usiarioServices.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Usiario usiario) {
        usiarioServices.save(usiario);
    }
}
