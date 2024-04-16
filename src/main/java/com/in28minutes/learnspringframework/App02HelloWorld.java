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

        // 3: Get the beans from the Spring Context

        // 4: Use the beans

    }

}
