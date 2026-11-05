package com.eazybytes.ex4;

import com.eazybytes.ex4.beans.Car;
import com.eazybytes.ex4.beans.Engine;
import com.eazybytes.ex4.beans.Person;
import com.eazybytes.ex4.beans.Vehicle;
import com.eazybytes.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var person = context.getBean(Person.class);
        var vehicle = context.getBean(Vehicle.class);
        System.out.println(" Person name from Spring Context: " + person.getName());
        System.out.println(" Vehicle name from Spring Context: " + vehicle.getName());
        System.out.println(" Vehicle that Person own : " + person.getVehicle());

        var car = context.getBean(Car.class);
        var engine = context.getBean(Engine.class);
        System.out.println(" Car name from Spring Context: " + car.getName());
        System.out.println(" Engine name from Spring Context: " + engine.getName());
        System.out.println(" Engine that Car own : " + car.getEngine());



    }
}
