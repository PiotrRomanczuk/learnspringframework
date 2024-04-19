package com.in28minutes.learnspringframework.streams;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        people.forEach(Person -> System.out.println(Person));

        System.out.println("------------------------------------------");
        System.out.println("People names(printed by stream):");
        people.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Antonio", 21, Gender.MALE),
                new Person("Alba", 22, Gender.FEMALE),
                new Person("Antonio", 21, Gender.MALE),
                new Person("Edith", 31, Gender.FEMALE));
    }
}
