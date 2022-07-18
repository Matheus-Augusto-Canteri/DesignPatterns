package DesignPatterns.src.br.com.alura.loja.Orcamento.Situacao;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.DomainException;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}
}
