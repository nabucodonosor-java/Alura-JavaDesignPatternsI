package com.alura.chainresponsibility.services.discounts;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;

public class DescontoValorQuinhentos extends Desconto {
	
	public DescontoValorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(orcamento);
	}

}
