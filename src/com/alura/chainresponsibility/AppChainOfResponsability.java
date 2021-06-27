package com.alura.chainresponsibility;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;
import com.alura.chainresponsibility.services.CalculadoraDesconto;

public class AppChainOfResponsability {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("501"), 1);
		CalculadoraDesconto desconto = new CalculadoraDesconto();
		System.out.println(desconto.calcular(orcamento));
		
	}

}
