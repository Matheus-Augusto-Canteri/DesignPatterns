package DesignPatterns.src.br.com.alura.loja.Orcamento.Situacao;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.DomainException;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser finalizado!");
	}

}
