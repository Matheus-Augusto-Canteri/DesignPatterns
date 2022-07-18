package DesignPatterns.src.br.com.alura.loja.pedido.acoes;

import DesignPatterns.src.br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Enviando email com dados do pedido 1");
    }

    @Override
    public void executarAcao(Pedido pedido) {
        // TODO Auto-generated method stub
        
    }
    
}
