package DesignPatterns.src.br.com.alura.loja.Orcamento;

import java.util.Map;

import DesignPatterns.src.br.com.alura.loja.DomainException;
import DesignPatterns.src.br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado");
        }
        //chamada http para a API externa
        //URL conection
        //http Client
        //lib rest
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
    
}
