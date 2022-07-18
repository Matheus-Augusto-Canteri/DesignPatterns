package DesignPatterns.src.br.com.alura.loja.http;

import java.util.Map;

public interface HttpAdapter { //multiplas funcionalidades
    
    void post(String url, Map<String, Object> dados);

}
