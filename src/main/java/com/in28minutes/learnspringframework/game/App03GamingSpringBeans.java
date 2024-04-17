package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
                GamingConfig.class)) {

            appContext.getBean(GamingConsole.class).up();

            appContext.getBean(GameRunner.class).run();

        }

    }

}
