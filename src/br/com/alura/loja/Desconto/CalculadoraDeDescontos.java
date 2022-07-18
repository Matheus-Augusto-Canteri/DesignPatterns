package DesignPatterns.src.br.com.alura.loja.Desconto;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
       Desconto desconto = new DescontoOrcamentoMais5Itens(new DescontoOrcamentoValorMaior500(new SemDesconto()));
        return desconto.efetuarCalculo(orcamento);
    }

}
