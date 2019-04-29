package com.company.for_each;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListForEachTutorial {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //lambda
        //Output : A,B,C,D,E
        items.forEach(item->System.out.println(item));

        System.out.println("\n");
        //Output : C
        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
        System.out.println("\n");
        //method reference
        //Output : A,B,C,D,E

        items.forEach(System.out::println);
        System.out.println("\n");
        //Stream and filter
        //Output : B
        items
             .stream()
             .filter(something->something.contains("B"))
             .forEach(System.out::println);

    }
}
