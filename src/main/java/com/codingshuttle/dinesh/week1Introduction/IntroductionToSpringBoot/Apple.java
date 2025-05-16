package com.codingshuttle.dinesh.week1Introduction.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Apple {

    void eatApple(){
        System.out.println("Iam eating apple.");
    }

    @PostConstruct
    void callThisBeforeAppleISUsed(){
        System.out.println("Create The Apple Before Used.");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying  the Apple Bean.");
    }
}
