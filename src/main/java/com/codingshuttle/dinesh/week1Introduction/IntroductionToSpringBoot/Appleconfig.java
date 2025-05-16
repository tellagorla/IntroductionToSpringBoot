package com.codingshuttle.dinesh.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appleconfig {

    @Bean
    @Scope("prototype")
    public Apple getApple(){
        return  new Apple();
    }
}
