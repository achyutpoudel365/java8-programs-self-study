package com.company.streams_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNowJava8 {
    public static void main(String[] args) {
        List<String>linesList = Arrays.asList("Spring", "Boot", "Framework");
        List<String>resultList = linesList
                .stream()
                .filter(line->!"Framework".equals(line))
                .collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }
}
