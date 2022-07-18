package DesignPatterns.src.br.com.alura.loja.test;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.ItemOrcamento;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;
import DesignPatterns.src.br.com.alura.loja.Orcamento.OrcamentoProxy;

public class TesteComposicao {

    public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);

		OrcamentoProxy proxy = new OrcamentoProxy(novo);

		System.out.println(proxy.getValor());
	}
    
}
