package com.uptc.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uptc.demo.models.RecursoBibliografico;
import com.uptc.demo.services.RecursoBibliograficoServices;

@RestController
@RequestMapping("/api/recurso-bibliografico")
public class RecursoBibliograficoController {
    @Autowired
    private RecursoBibliograficoServices recursoBibliograficoServices;

    @GetMapping("/getAll")
    public List<RecursoBibliografico> getAll() {
        return recursoBibliograficoServices.findAll();
    }

    @GetMapping("/getById/{id}")
    public RecursoBibliografico getById(@PathVariable Long id) {
        return recursoBibliograficoServices.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        recursoBibliograficoServices.deleteById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody RecursoBibliografico recurso) {
        recursoBibliograficoServices.save(recurso);
    }
}
