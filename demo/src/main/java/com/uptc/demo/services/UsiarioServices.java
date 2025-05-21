package com.uptc.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uptc.demo.models.Usiario;
import com.uptc.demo.repository.UsiarioRepository;

@Service
public class UsiarioServices {
    @Autowired
    private UsiarioRepository usiarioRepository;

    public void save(Usiario usiario) {
        if (usiario.getId() != null) {
            Usiario existing = usiarioRepository.findById(usiario.getId()).orElse(null);
            if (existing != null) {
                existing.setNombre(usiario.getNombre());
                existing.setCorreo(usiario.getCorreo());
                existing.setTelefono(usiario.getTelefono());
                usiarioRepository.save(existing);
                return;
            }
        }
        usiarioRepository.save(usiario);
    }

    public List<Usiario> findAll() {
        return usiarioRepository.findAll();
    }

    public Usiario findById(Long id) {
        return usiarioRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        usiarioRepository.deleteById(id);
    }
}
