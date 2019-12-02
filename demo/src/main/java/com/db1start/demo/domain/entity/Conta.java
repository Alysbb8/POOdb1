package com.db1start.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.db1start.demo.domain.status.Status;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@OneToOne
	@Column(name = "cliente_id")
	private Cliente cliente;
	
	@Column
	private Status status;
	
	public Conta(Double saldo, Agencia agencia, Cliente cliente) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Long getId() {
		return id;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
