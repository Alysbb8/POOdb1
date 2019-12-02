package com.db1start.demo.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name = "agencia")
public class Agencia {

	@Id
	@OneToMany
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numeroAgencia")
	private String numeroAgencia;
	
	@Column(name = "digitoBanco")
	private String digitoBanco;
	
	@ManyToOne
	@JoinColumn(name = "cidade")
	private Cidade cidade;
	
	
	public Agencia(String numeroAgencia, String digitoBanco, Cidade cidade) {
		this.numeroAgencia = numeroAgencia;
		this.digitoBanco = digitoBanco;
		this.cidade = cidade;
		
	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public void setNumeroAgencia() {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String getDigitoBanco() {
		return digitoBanco;
	}
	
	public void setDigitoBanco() {
		this.digitoBanco = digitoBanco;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade() {
		this.cidade = cidade;
	}
	
	
}
