package com.alura.state.entities;

import java.math.BigDecimal;

import com.alura.state.entities.extrasdiscounts.EmAnalise;
import com.alura.state.entities.extrasdiscounts.StatusOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int qtdeItens;
	private StatusOrcamento status;

	public Orcamento(BigDecimal valor, int qtdeItens) {
		this.qtdeItens = qtdeItens;
		this.valor = valor;
		this.status = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal descontoExtra = this.status.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(descontoExtra);
	}
	
	public void aprovar() {
		this.status.aprovar(this);
	}
	
	public void reprovar() {
		this.status.reprovar(this);
	}
	
	public void finalizar() {
		this.status.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQtdeItens() {
		return qtdeItens;
	}

	public StatusOrcamento getStatus() {
		return status;
	}

	public void setStatus(StatusOrcamento status) {
		this.status = status;
	}

	

}
