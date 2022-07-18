package DesignPatterns.src.br.com.alura.loja.Imposto;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
                
        }
        
    }
    

