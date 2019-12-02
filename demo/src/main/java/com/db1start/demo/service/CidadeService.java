package com.db1start.demo.service;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.db1start.demo.domain.entity.Cidade;
import com.db1start.demo.domain.entity.Estado;
import com.db1start.demo.repository.CidadeRepository;

@Entity
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoService estadoService;
	
	public Cidade criar(String nome, Long estadoId) {
		Estado estado = estadoService.buscarPorId(estadoId);
		Cidade cidade = new Cidade(nome, estado);
		return cidadeRepository.save(cidade);
		
	}
	
	public Cidade buscaPorId(Long id) {
		return cidadeRepository.findById(id).orElseThrow(()-> new RuntimeException("Cidade não encontrada"));
	}
	
	
	
}
