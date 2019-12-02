package com.db1start.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.demo.domain.entity.Agencia;
import com.db1start.demo.domain.entity.Cidade;
import com.db1start.demo.repository.AgenciaRepository;

@Service
public class AgenciaService {

	@Autowired
	private AgenciaRepository agenciaRepository;
	@Autowired
	private CidadeService cidadeService;
	
	public Agencia criar(String numeroAgencia, String digitoBanco, Long cidadeId) {
		Cidade cidade = cidadeService.buscaPorId(cidadeId);
		Agencia agencia = new Agencia(numeroAgencia, digitoBanco, cidade);
		return agenciaRepository.save(agencia);
	}
	
	public Agencia buscaPorId(Long id) {
		return agenciaRepository.findById(id).orElseThrow(()-> new RuntimeException("Agência não existe"));
	}

}
