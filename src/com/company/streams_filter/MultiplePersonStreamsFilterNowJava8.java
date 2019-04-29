package com.company.streams_filter;

import java.util.Arrays;
import java.util.List;

public class MultiplePersonStreamsFilterNowJava8 {
    public static void main(String[] args) {
        List<Person> personList =Arrays.asList(
                new Person("Achyut", 22),
                new Person("Nabin", 25),
                new Person("Aditya", 23),
                new Person("Ujjwal", 24)
        );

        Person result1 = personList
                .stream()
                .filter((p)->"Aditya".equals(p.getName()) && 23==p.getAge())
                .findAny()
                .orElse(null);
        System.out.println("RESULT 1 = "+result1);

//        or like this, we can use if condition inside the stream
        Person result2 = personList
                .stream()
                .filter((p)-> {
                    if ("Aditya".equals(p.getName()) && 23 == p.getAge()){
                        return true;
                    }
                    return false;
                })
                .findAny()
                .orElse(null);

        System.out.println("\nRESULT 2 = "+result2);

    }
}
