package com.alura.command.services;

import java.math.BigDecimal;

import com.alura.command.entities.Orcamento;
import com.alura.command.services.discounts.Desconto;
import com.alura.command.services.discounts.DescontoCincoItens;
import com.alura.command.services.discounts.DescontoValorQuinhentos;
import com.alura.command.services.discounts.SemDesconto;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDedesconto = new DescontoCincoItens(new DescontoValorQuinhentos(
				new SemDesconto()));
		
		return cadeiaDedesconto.calcular(orcamento);
	}
}
