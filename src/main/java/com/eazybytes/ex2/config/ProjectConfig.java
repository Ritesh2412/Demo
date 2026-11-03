package com.eazybytes.ex2.config;


import com.eazybytes.ex2.beans.Vehicle;
import org.springframework.context.annotation.*;


@Configuration
@Import({AnotherProjectConfig.class})
public class ProjectConfig {

    @Bean(name="hondaVehicle")
    Vehicle vehicle1(){
        var  veh= new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Primary
    @Bean(value="audiVehicle")
    Vehicle vehicle2(){
        var  veh= new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean("ferrariVehicle")
    @Description("This is a vehicle class bean")
    Vehicle vehicle3(){
        var  veh= new Vehicle();
        veh.setName("Ferrari ");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello Word";
    }

    @Bean
    Integer luckyNumber(){
        return 16;
    }
}
