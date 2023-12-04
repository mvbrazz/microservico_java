package com.projeto.microservico.metodos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.projeto.microservico.entidades.Endereco;

@Service
public class MetodosEndereco {

    @Autowired
    private RestTemplate restTemplate;

    public Endereco getEndereco(String cep){

        Map<String,String>variavel  = new HashMap<>();
        variavel.put("CEP",""+cep);

        Endereco end = restTemplate.getForObject("https://viacep.com.br/ws/{CEP}/json/",Endereco.class,variavel);
        return end;
    }
    
}
