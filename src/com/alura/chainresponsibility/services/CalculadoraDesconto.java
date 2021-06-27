package com.alura.chainresponsibility.services;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQtdeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return BigDecimal.ZERO;
	}

}
