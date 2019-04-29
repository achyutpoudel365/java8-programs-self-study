package com.company.streams_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterAndMapNowJava8 {
    public static void main(String[] args) {
        List<Person> personList =Arrays.asList(
                new Person("Achyut", 22),
                new Person("Nabin", 25),
                new Person("Aditya", 23),
                new Person("Ujjwal", 24)
        );

        String name = personList
                .stream()
                .filter(p -> "Achyut".equals(p.getName()))
                .map(Person::getName)                       // this converts stream to string
                .findAny()
                .orElse("");

        System.out.println("NAME = "+name+"\n");

        List <String> collectList = personList
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collectList.forEach(System.out::println);
    }
}
