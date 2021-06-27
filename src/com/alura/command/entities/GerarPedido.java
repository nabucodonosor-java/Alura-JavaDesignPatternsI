package com.alura.command.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {
	
	private String nomeCLiente;
	private BigDecimal valorOrcamento;
	private Integer qtdeItens;
	
	public void executar() {
		Orcamento orcamento = new Orcamento(valorOrcamento, qtdeItens);
		Pedido pedido = new Pedido(nomeCLiente, LocalDateTime.now(), orcamento);
		
		
		System.out.println("Data do pedido: " + pedido.getData());
		System.out.println("Nome do cliente: " + pedido.getNomeCliente());
		System.out.println(orcamento);
		
	}

	public GerarPedido(String nomeCLiente, BigDecimal valorOrcamento, Integer qtdeItens) {
		super();
		this.nomeCLiente = nomeCLiente;
		this.valorOrcamento = valorOrcamento;
		this.qtdeItens = qtdeItens;
	}

}
