package com.in28minutes.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
}

record Address(String city, String country) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Piotr";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person Edytek() {
        return new Person("Edytek", 30, new Address("Jaktorow", "Poland"));
    }

    @Bean
    public Person PersonFromTheBean() {
        return new Person(name(), age(), warsawAddress());
    }

    // @Bean
    // public Person PersonFromTheParams(String name, int age, Address address) {
    // name = this.name();
    // age = this.age();
    // address = this.address();
    // return new Person(name, age, address);
    // }

    // private Address address() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'address'");
    // }

    @Bean
    public Address warsawAddress() {
        return new Address("Warsaw", "Poland");
    }

}
