package com.eazybytes.ex6.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.eazybytes.ex6.beans"})
public class ProjectScopeConfig {
}
