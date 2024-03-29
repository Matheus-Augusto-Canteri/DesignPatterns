package DesignPatterns.src.br.com.alura.loja.Desconto;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento); 
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);

}
