package com.uptc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uptc.demo.models.RecursoBibliografico;

@Repository
public interface RecursoBibliograficoRepository extends JpaRepository<RecursoBibliografico, Long> {
}
