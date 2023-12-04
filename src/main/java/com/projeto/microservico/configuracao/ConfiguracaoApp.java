package com.projeto.microservico.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracaoApp {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
}
