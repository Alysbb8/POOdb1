package com.db1start.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.demo.domain.entity.Agencia;
import com.db1start.demo.domain.entity.Cliente;
import com.db1start.demo.domain.entity.Conta;
import com.db1start.demo.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private AgenciaService agenciaService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	public ContaRepository contaRepository;

	
	public Conta criar(Double saldo, Long agenciaId,Long clienteId) {
		Agencia agencia = agenciaService.buscaPorId(agenciaId);
		Cliente cliente = clienteService.buscaPorId(clienteId);
		Conta conta = new Conta(saldo, agencia, cliente);
		return contaRepository.save(conta);
		}
	
	
	
	
}
