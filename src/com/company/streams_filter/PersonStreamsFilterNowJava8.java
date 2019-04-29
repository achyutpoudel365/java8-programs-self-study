package com.company.streams_filter;

import java.util.Arrays;
import java.util.List;

public class PersonStreamsFilterNowJava8 {
    public static void main(String[] args) {
        List<Person> personList =Arrays.asList(
                new Person("Achyut", 22),
                new Person("Nabin", 25),
                new Person("Aditya", 23),
                new Person("Ujjwal", 24)
        );

        Person result = personList
                .stream()                                       // Convert to steam
                .filter(x->"Achyut".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                            // If not found, return null

        System.out.println(result);

        Person result2 = personList.stream()
                .filter(x -> "NabinJi".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);
    }
}
