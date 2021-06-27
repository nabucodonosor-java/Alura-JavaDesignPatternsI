package com.alura.command.entities.extrasdiscounts;

import java.math.BigDecimal;

import com.alura.command.entities.Orcamento;

public class EmAnalise extends StatusOrcamento{
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setStatus(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setStatus(new Reprovado());
	}
}
