package com.alura.state.entities.extrasdiscounts;

import com.alura.state.entities.Orcamento;

public class Reprovado extends StatusOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setStatus(new Finalizado());
	}
}
