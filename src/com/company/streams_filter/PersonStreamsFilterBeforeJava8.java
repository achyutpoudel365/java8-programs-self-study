package com.company.streams_filter;

import java.util.Arrays;
import java.util.List;

public class PersonStreamsFilterBeforeJava8 {
    public static void main(String[] args) {
        List<Person> personList =Arrays.asList(
                new Person("Achyut", 22),
                new Person("Nabin", 25),
                new Person("Aditya", 23),
                new Person("Ujjwal", 24)
        );

        Person result = GetStudentByName(personList, "Achyut");
        System.out.println(result);
    }

    private static Person GetStudentByName(List<Person> personList, String achyut) {
        Person nextResult=null;
        for (Person temp:personList){
            if (achyut.equals(temp.getName())){
                nextResult = temp;
            }
        }
        return nextResult;
    }
}
