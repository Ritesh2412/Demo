package com.eazybytes.ex4.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;

    //    @Autowired  // Field Injection
    private Engine engine;


    //Contructor Injection
    @Autowired  //For Contructor Injection @Autowired is optional.
    public Car(Engine engine){
        this.engine=engine;
        System.out.println("Car bean created");
    }

    public Engine getEngine() {
        return engine;
    }

//    @Autowired  // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name= "BMW";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
