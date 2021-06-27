package com.alura.state;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;
import com.alura.state.services.CalculadoraDesconto;

public class AppState {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("499"), 2);
		CalculadoraDesconto desconto = new CalculadoraDesconto();
		System.out.println(desconto.calcular(orcamento));

	}

}
