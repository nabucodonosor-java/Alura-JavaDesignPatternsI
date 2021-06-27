package com.alura.strategy.entities.taxes;

import java.math.BigDecimal;

import com.alura.strategy.entities.Orcamento;

public class ICMS implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
