package DesignPatterns.src.br.com.alura.loja.Imposto;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class ICMS extends Imposto{

    public ICMS(Imposto outro) {
        super(outro);
        //TODO Auto-generated constructor stub
    }

    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    
}
