package com.eazybytes.ex2;

import com.eazybytes.ex2.beans.Vehicle;
import com.eazybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Spring Context: " + veh.getName());

        var vehicle = (Vehicle)context.getBean("ferrariVehicle");
        System.out.println("Spring Context: " + vehicle.getName());

        var vhcle= context.getBean(Vehicle.class);
        System.out.println("Spring Context: " + vhcle.getName());

        var helloWorld = context.getBean("helloWorld",String.class);
        System.out.println("String value from Spring Context is: " + helloWorld);

    }
}
