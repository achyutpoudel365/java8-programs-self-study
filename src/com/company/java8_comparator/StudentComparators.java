package com.company.java8_comparator;

import java.util.ArrayList;
import java.util.List;


public class StudentComparators {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Achyut", "M"));
        studentList.add(new Student("Nabin", "M"));
        studentList.add(new Student("Aditya", "M"));
        studentList.add(new Student("Sreety", "F"));
        studentList.add(new Student("Nisha", "F"));
        studentList.add(new Student("Moni", "F"));
        studentList.add(new Student("Ujjwal", "M"));

        System.out.println("List before Sorting the Students:: ");
        studentList.forEach(student -> System.out.println(student));

        System.out.println("List after sorting the Students:: ");
        studentList.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName()));
        studentList.forEach(student -> System.out.println(student));

    }

}