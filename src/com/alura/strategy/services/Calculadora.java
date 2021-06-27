package com.alura.strategy.services;

import java.math.BigDecimal;

import com.alura.strategy.entities.Orcamento;
import com.alura.strategy.enums.TipoImposto;

public class Calculadora {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

		switch (tipoImposto) {
		case ICMS:

			return orcamento.getValor().multiply(new BigDecimal("0.1"));

		case ISS:

			return orcamento.getValor().multiply(new BigDecimal("0.06"));

		default:
			return BigDecimal.ZERO;
		}

	}

}
