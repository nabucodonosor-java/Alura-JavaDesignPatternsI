package com.alura.templatemethod;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;
import com.alura.chainresponsibility.services.CalculadoraDesconto;

public class AppTemplateMethod {
public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("499"), 2);
		CalculadoraDesconto desconto = new CalculadoraDesconto();
		System.out.println(desconto.calcular(orcamento));
		
	}

}
