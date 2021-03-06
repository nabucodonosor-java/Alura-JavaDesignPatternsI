package com.alura.templatemethod.services;

import java.math.BigDecimal;

import com.alura.chainresponsibility.entities.Orcamento;
import com.alura.chainresponsibility.services.discounts.Desconto;
import com.alura.chainresponsibility.services.discounts.DescontoCincoItens;
import com.alura.chainresponsibility.services.discounts.DescontoValorQuinhentos;
import com.alura.chainresponsibility.services.discounts.SemDesconto;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDedesconto = new DescontoCincoItens(new DescontoValorQuinhentos(
				new SemDesconto()));
		
		return cadeiaDedesconto.calcular(orcamento);
	}

}
