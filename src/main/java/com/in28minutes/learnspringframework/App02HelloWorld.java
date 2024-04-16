package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // 1: Launch a Spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage - @Configuration

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println("--------------------------------------------------------");

        System.out.println(context.getBean("Edytek"));
        System.out.println(context.getBean("PersonFromTheBean"));
        System.out.println(context.getBean("PersonFromTheParams", "Jarek", 65, context.getBean("warsawAddress")));

        System.out.println("--------------------------------------------------------");
        System.out.println(context.getBean(Address.class));

        // 3: Get the beans from the Spring Context

        // 4: Use the beans

    }

}
