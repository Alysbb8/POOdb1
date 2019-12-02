package com.db1start.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.demo.domain.entity.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Long> {
	
	Optional<Agencia> findBynumeroAgencia(String numeroAgencia);
}
