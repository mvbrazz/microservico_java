package com.projeto.microservico.rotas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.microservico.entidades.Endereco;
import com.projeto.microservico.metodos.MetodosEndereco;

@RestController
@RequestMapping(value = "/endereco")
public class RotasEndereco {
    
    @Autowired
    private MetodosEndereco metodo;


    @GetMapping(value = "/hello")
    public ResponseEntity<String>getHello(){
        String hello = "Hello Word";
        return ResponseEntity.ok(hello);
    }

    @GetMapping(value = "/{cep}")
    public ResponseEntity<Endereco>getEnd(@PathVariable String cep){
        Endereco end = metodo.getEndereco(cep);
        return ResponseEntity.ok(end);
    }
}
