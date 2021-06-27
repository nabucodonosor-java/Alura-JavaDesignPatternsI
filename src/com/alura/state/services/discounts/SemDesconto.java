package com.alura.state.services.discounts;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	@Override
	public boolean aplicaDesconto(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
