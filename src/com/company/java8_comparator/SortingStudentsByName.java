package com.company.java8_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByName {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Ram ");
        names1.add("Shyam ");
        names1.add("Narayan ");
        names1.add("gopal ");
        names1.add("Hareram ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Hareram ");
        names2.add("Gopal ");
        names2.add("Narayan ");
        names2.add("Shyam ");
        names2.add("Ram ");

        SortingStudentsByName sorter = new SortingStudentsByName();
        System.out.println("Sort using Java 7 syntax: ");

        sorter.sortingUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");

        sorter.sortingUsingJava8(names2);
        System.out.println(names2);
    }

    //sort using java 7
    private void sortingUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortingUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
