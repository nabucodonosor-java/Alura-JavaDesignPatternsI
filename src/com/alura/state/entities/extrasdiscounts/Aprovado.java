package com.alura.state.entities.extrasdiscounts;

import java.math.BigDecimal;

import com.alura.state.entities.Orcamento;

public class Aprovado extends StatusOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setStatus(new Finalizado());
	}
}
