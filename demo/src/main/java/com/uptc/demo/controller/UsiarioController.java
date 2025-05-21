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

import com.uptc.demo.models.Usiario;
import com.uptc.demo.models.UsiarioDTO;
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
    public void save(@RequestBody UsiarioDTO usiarioDTO) {
        Usiario usiario = new Usiario();
        usiario.setNombre(usiarioDTO.getNombre());
        usiario.setCorreo(usiarioDTO.getCorreo());
        usiario.setTelefono(usiarioDTO.getTelefono());
        usiarioServices.save(usiario);
    }
}
