package com.alura.templatemethod.services.discounts;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	public abstract boolean aplicaDesconto(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		if (aplicaDesconto(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
}
