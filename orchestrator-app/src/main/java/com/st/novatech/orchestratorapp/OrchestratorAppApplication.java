package com.st.novatech.orchestratorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrchestratorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrchestratorAppApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemnplate(){
        return new RestTemplate();
    }

}
