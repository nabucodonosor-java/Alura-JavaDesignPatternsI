package com.alura.chainresponsibility.services.discounts;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);

}