package com.alura.strategy.entities.taxes;

import java.math.BigDecimal;

import com.alura.strategy.entities.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);	

}
