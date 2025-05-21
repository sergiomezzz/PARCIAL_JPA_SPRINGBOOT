package com.uptc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.demo.models.Usiario;

@Repository
public interface UsiarioRepository extends JpaRepository<Usiario, Long> {
}
