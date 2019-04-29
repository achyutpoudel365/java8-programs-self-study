package com.company.streams_map_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8First {
    public static void main(String[] args) {
        List<String> alphaList = Arrays.asList("a", "b", "c", "d", "e");

//        Before java 8
        List<String> alphaUpperList = new ArrayList<>();
        for (String s : alphaList) {
            alphaUpperList.add(s.toUpperCase());
        }

        System.out.println(alphaList);
        System.out.println(alphaUpperList);


//        Now in java 8
        List<String> collectList = alphaList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collectList);


//        Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
