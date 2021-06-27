package com.alura.state.services;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;
import com.alura.state.services.discounts.Desconto;
import com.alura.state.services.discounts.DescontoCincoItens;
import com.alura.state.services.discounts.DescontoValorQuinhentos;
import com.alura.state.services.discounts.SemDesconto;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDedesconto = new DescontoCincoItens(new DescontoValorQuinhentos(
				new SemDesconto()));
		
		return cadeiaDedesconto.calcular(orcamento);
	}
}
