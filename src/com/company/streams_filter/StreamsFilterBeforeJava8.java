package com.company.streams_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsFilterBeforeJava8 {
    public static void main(String[] args) {
        List <String> linesList = Arrays.asList("Spring","Boot","framework");
        List<String> resultList = getFilterOutput(linesList,"framework");
        for(String temp:resultList){
            System.out.println(temp);   // output is: Spring, Boot
        }
    }

    private static List<String> getFilterOutput(List<String> linesList, String framework) {
        List<String> nextResult = new ArrayList<>();
        for (String lines:linesList){
            if (!"framework".equals(lines)) {
                nextResult.add(lines);
            }
        }
        return nextResult;
    }
}