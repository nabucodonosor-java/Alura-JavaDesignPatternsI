package com.alura.command.services.discounts;

import java.math.BigDecimal;

import com.alura.command.entities.Orcamento;

public class DescontoCincoItens extends Desconto {

	public DescontoCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean aplicaDesconto(Orcamento orcamento) {
		return (orcamento.getQtdeItens() > 5);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
