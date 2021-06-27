package com.alura.command;

import java.math.BigDecimal;

import com.alura.command.entities.GerarPedido;

public class AppCommand {

	public static void main(String[] args) {
	
		String nome = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int qtde = Integer.parseInt(args[2]);
		
		GerarPedido gerador = new GerarPedido(nome, valorOrcamento, qtde);
		
		gerador.executar();

	}

}
