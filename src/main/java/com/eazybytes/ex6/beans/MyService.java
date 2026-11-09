package com.eazybytes.ex6.beans;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)// OPTIONAL
@Lazy  //if someone is asking , then only it gets created.
public class MyService {

    public MyService(){
        System.out.println("MyService bean is created");
    }
}
