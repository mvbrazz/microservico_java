package com.projeto.microservico.metodos;

import org.springframework.stereotype.Service;

import com.projeto.microservico.entidades.Endereco;

@Service
public class MetodosEndereco {

    public Endereco getEndereco(String cep){
        Endereco end = new Endereco("123","praça","lado", "Centro","Leópolis","Pr","1234","123","043","1");
        return end;
    }
    
}
