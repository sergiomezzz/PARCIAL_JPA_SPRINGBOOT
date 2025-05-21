package com.uptc.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uptc.demo.models.RecursoBibliografico;
import com.uptc.demo.repository.RecursoBibliograficoRepository;

@Service
public class RecursoBibliograficoServices {
    @Autowired
    private RecursoBibliograficoRepository recursoBibliograficoRepository;

    public void save(RecursoBibliografico recurso) {
        if (recurso.getId() != null) {
            RecursoBibliografico existing = recursoBibliograficoRepository.findById(recurso.getId()).orElse(null);
            if (existing != null) {
                existing.setTitulo(recurso.getTitulo());
                existing.setAutor(recurso.getAutor());
                existing.setTipo(recurso.getTipo());
                existing.setEstado(recurso.getEstado());
                recursoBibliograficoRepository.save(existing);
                return;
            }
        }
        recursoBibliograficoRepository.save(recurso);
    }

    public List<RecursoBibliografico> findAll() {
        return recursoBibliograficoRepository.findAll();
    }

    public RecursoBibliografico findById(Long id) {
        return recursoBibliograficoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        recursoBibliograficoRepository.deleteById(id);
    }
}
