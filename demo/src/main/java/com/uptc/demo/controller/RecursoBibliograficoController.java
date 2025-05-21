package com.uptc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.demo.models.RecursoBibliografico;
import com.uptc.demo.models.RecursoBibliograficoDTO;
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
    public void save(@RequestBody RecursoBibliograficoDTO recursoDTO) {
        RecursoBibliografico recurso = new RecursoBibliografico();
        recurso.setTitulo(recursoDTO.getTitulo());
        recurso.setAutor(recursoDTO.getAutor());
        recurso.setTipo(recursoDTO.getTipo());
        recursoBibliograficoServices.save(recurso);
    }
}
