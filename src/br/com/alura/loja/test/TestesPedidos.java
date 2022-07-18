package DesignPatterns.src.br.com.alura.loja.test;

import java.math.BigDecimal;
import java.util.Arrays;

import DesignPatterns.src.br.com.alura.loja.pedido.GeraPedido;
import DesignPatterns.src.br.com.alura.loja.pedido.GeraPedidoHandler;
import DesignPatterns.src.br.com.alura.loja.pedido.acoes.CriarPedidoNoBanco;
import DesignPatterns.src.br.com.alura.loja.pedido.acoes.EnviarEmailPedido;
import DesignPatterns.src.br.com.alura.loja.pedido.acoes.LogDePedido;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new CriarPedidoNoBanco(), new EnviarEmailPedido(), new LogDePedido()));
        handler.executar(gerador);
    }
    
}
