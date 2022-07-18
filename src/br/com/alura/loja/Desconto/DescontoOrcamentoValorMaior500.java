package DesignPatterns.src.br.com.alura.loja.Desconto;
import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class DescontoOrcamentoValorMaior500 extends Desconto{

    public DescontoOrcamentoValorMaior500(Desconto proximo){
        super(proximo);
    }
    
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
    }
}