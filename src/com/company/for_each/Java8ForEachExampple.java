package com.company.for_each;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java8ForEachExampple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("normal way to loop a map using for  each loop");
        Map<String, Integer> items=new HashMap<>();
        items.put("U",12);
        items.put("V",13);
        items.put("W",14);
        items.put("X",15);
        items.put("Y",16);
        items.put("Z",17);

        for (Map.Entry<String, Integer>entry : items.entrySet()){
            System.out.println("Item is: "+entry.getKey() + " Count of "+entry.getKey()+" Is:: "+entry.getValue());
        }

        System.out.println("\nnew way to loop a map using for each loop");
        items.forEach((k,v)-> System.out.println("Item is : "+k+ " Count of "+k+" Is:: "+v));


        System.out.println("\nEnter the Name of Item If you want to Print Hello to Your Item");
        System.out.println("Name::");
        String a = scanner.next();
//        System.out.println("\nAnother way to loop a map using for  each loop with calling Hello to Custom Key");
        items.forEach((k,v)->{
//            System.out.println("Item : " + k + " Count : " + v);

            if(a.equals(k)){
                System.out.println("\nHello  "+k);

            }
            if (!(a.equals(k))){
                System.out.println("Your Item "+a+" is not valid");
                System.out.println("You Have To Give The Name Of Item Between ");


            }


        });

    }
}
