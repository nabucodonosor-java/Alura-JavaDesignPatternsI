package com.alura.services;

import java.math.BigDecimal;

import com.alura.entidades.Orcamento;

public class Calculadora {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
