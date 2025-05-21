package com.uptc.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uptc.demo.models.Prestamo;
import com.uptc.demo.repository.PrestamoRepository;

@Service
public class PrestamoServices {
    @Autowired
    private PrestamoRepository prestamoRepository;

    public void save(Prestamo prestamo) {
        if (prestamo.getId() != null) {
            Prestamo existing = prestamoRepository.findById(prestamo.getId()).orElse(null);
            if (existing != null) {
                existing.setFechaPrestamo(prestamo.getFechaPrestamo());
                existing.setFechaDevolucion(prestamo.getFechaDevolucion());
                existing.setEstado(prestamo.getEstado());
                existing.setUsiario(prestamo.getUsiario());
                existing.setRecursoBibliografico(prestamo.getRecursoBibliografico());
                prestamoRepository.save(existing);
                return;
            }
        }
        prestamoRepository.save(prestamo);
    }

    public List<Prestamo> findAll() {
        return prestamoRepository.findAll();
    }

    public Prestamo findById(Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        prestamoRepository.deleteById(id);
    }
}
