package com.alura.chainresponsibility.services;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;
import com.alura.chainresponsibility.services.discounts.Desconto;
import com.alura.chainresponsibility.services.discounts.DescontoCincoItens;
import com.alura.chainresponsibility.services.discounts.DescontoValorQuinhentos;
import com.alura.chainresponsibility.services.discounts.SemDesconto;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new DescontoCincoItens(new DescontoValorQuinhentos(
				new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
