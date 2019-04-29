package com.company.streams_map_examples;

import com.company.streams_filter.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8Second {
    public static void main(String[] args) {
        List<ListOfObjectsStaff> staffList = Arrays.asList(
                new ListOfObjectsStaff("Achyut", 22, new BigDecimal(80000)),
                new ListOfObjectsStaff("Nabin", 25, new BigDecimal(75000)),
                new ListOfObjectsStaff("Aditya", 23, new BigDecimal(65000)),
                new ListOfObjectsStaff("Ujjwal", 24, new BigDecimal(70000))
        );


//        Before Java 8

        List<String> result = new ArrayList<>();
        for (ListOfObjectsStaff staff : staffList){
            result.add(staff.getName());
        }
        System.out.println(result);


//        Using JAVA 8

        List<String> collectList = staffList.stream().map(m->m.getName()).collect(Collectors.toList());
        System.out.println(collectList);    // prints Achyut, Nabin, Aditya, Ujjwal
    }
}
