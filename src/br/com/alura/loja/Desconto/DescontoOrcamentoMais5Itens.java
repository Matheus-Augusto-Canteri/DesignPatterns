package DesignPatterns.src.br.com.alura.loja.Desconto;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class DescontoOrcamentoMais5Itens extends Desconto{
    
    public DescontoOrcamentoMais5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1")); // cadeia
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;

    }
}
