package com.eazybytes.ex6;

import com.eazybytes.ex6.beans.MyService;
import com.eazybytes.ex6.config.ProjectScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exmple6 {

    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectScopeConfig.class);
       var myser1= context.getBean(MyService.class);
       var myser2= context.getBean(MyService.class);
        System.out.println(myser1.hashCode());
        System.out.println(myser2.hashCode());
    }
}
