package com.db1start.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1start.demo.domain.entity.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

	Optional<Conta>	findByCliente(String cliente);
}
