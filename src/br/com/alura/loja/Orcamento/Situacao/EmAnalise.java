package DesignPatterns.src.br.com.alura.loja.Orcamento.Situacao;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.DomainException;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}

}
