package DesignPatterns.src.br.com.alura.loja.pedido.acoes;

import DesignPatterns.src.br.com.alura.loja.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
	}

}
