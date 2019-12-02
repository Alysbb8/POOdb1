package com.db1start.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.demo.domain.entity.Estado;
import com.db1start.demo.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	
	
	public Estado criar(String nome) {
		Estado estado = new Estado(nome);
		return estadoRepository.save(estado);
	} 
	
	public void limpar() {
		estadoRepository.deleteAll();
	}
	
	public Estado buscarPorNome(String nome) {
		return estadoRepository.findByNome(nome).orElseThrow(() -> new RuntimeException("Estado não encontrado."));
	}
	
	public Estado buscarPorId(Long id) {
		return estadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Estado não encontrado."));
	}
}
