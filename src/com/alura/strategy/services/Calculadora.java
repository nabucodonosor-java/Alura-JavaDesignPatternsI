package com.alura.strategy.services;

import java.math.BigDecimal;

import com.alura.strategy.entities.Orcamento;
import com.alura.strategy.entities.taxes.Imposto;

public class Calculadora {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

		return imposto.calcular(orcamento);
	}

}
