package com.uptc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.demo.models.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
