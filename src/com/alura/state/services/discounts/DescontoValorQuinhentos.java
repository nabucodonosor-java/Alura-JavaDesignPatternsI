package com.alura.state.services.discounts;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;

public class DescontoValorQuinhentos extends Desconto {

	public DescontoValorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean aplicaDesconto(Orcamento orcamento) {
		return (orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

}
