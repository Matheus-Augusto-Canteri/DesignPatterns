package DesignPatterns.src.br.com.alura.loja.Orcamento.Situacao;

import java.math.BigDecimal;

import DesignPatterns.src.br.com.alura.loja.DomainException;
import DesignPatterns.src.br.com.alura.loja.Orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

}
