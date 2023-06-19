package com.alonsopedro.projectcartolabasquete.repositories;

import jakarta.persistence.Id;

import com.alonsopedro.projectcartolabasquete.models.Integrante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Long> {


}

