package com.alura.chainresponsibility.services.discounts;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		
		return BigDecimal.ZERO;
	}

}
