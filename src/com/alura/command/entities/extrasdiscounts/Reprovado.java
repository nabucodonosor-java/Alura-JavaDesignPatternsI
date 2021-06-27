package com.alura.command.entities.extrasdiscounts;

import com.alura.command.entities.Orcamento;

public class Reprovado extends StatusOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setStatus(new Finalizado());
	}
}
