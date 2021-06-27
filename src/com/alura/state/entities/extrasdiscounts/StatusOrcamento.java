package com.alura.state.entities.extrasdiscounts;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;

public abstract class StatusOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser finalizado!");
	}

}
