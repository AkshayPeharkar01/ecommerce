package com.ecommerce.config;

import org.springframework.context.annotation.Configuration;

@Configuration

public class ProjrctConfig {

    @Bean
    public  ModelMapper mapper(){

        return new ModelMapper();


}
