package com.db1start.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.db1start.demo.domain.entity.Cliente;
import com.db1start.demo.repository.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente criar(String nome, String cpf, String telefone) {
		Cliente cliente = new Cliente(nome, cpf, telefone);
		return clienteRepository.save(cliente);
	}
	
	public Cliente buscaPorId(Long id) {
		return clienteRepository.findById(id).orElseThrow(()-> new RuntimeException ("Cliente com esse nome não existe"));
	}
	
	public List<Cliente> buscarTodos(){
		return clienteRepository.findAll();
		
	}
}
