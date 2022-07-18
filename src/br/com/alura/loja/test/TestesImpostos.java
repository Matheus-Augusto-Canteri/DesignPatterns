package DesignPatterns.src.br.com.alura.loja.test;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Imposto.ICMS;
import DesignPatterns.src.br.com.alura.loja.Imposto.ISS;
import DesignPatterns.src.br.com.alura.loja.Imposto.Imposto;
import DesignPatterns.src.br.com.alura.loja.Orcamento.ItemOrcamento;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class TestesImpostos {

    public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
    }
    
}
