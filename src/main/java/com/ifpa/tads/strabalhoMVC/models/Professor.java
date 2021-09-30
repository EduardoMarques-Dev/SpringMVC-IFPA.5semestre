package com.ifpa.tads.strabalhoMVC.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false) 
	private String nome;
	private BigDecimal salario;
	@Enumerated(EnumType.STRING)
	private StatusProfessor statusProfessor;
	
	public Professor(String nome, BigDecimal salario, StatusProfessor statusProfessor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.statusProfessor = statusProfessor;
	}



}
