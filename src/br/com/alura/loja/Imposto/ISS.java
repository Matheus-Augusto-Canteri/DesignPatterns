package DesignPatterns.src.br.com.alura.loja.Imposto;
import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class ISS extends Imposto{

    public ISS(Imposto outro) {
        super(outro);
        //TODO Auto-generated constructor stub
    }

    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
    
}
