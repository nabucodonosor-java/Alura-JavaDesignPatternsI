package com.alura.templatemethod.entities;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int qtdeItens;

	public Orcamento(BigDecimal valor, int qtdeItens) {
		this.qtdeItens = qtdeItens;
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQtdeItens() {
		return qtdeItens;
	}

}
