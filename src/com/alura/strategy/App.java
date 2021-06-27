package com.alura.strategy;

import java.math.BigDecimal;

import com.alura.strategy.entities.Orcamento;
import com.alura.strategy.enums.TipoImposto;
import com.alura.strategy.services.Calculadora;

public class App {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));
	}

}
