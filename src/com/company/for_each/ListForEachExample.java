package com.company.for_each;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListForEachExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list= new ArrayList<>();
        list.add("hari");
        list.add("ramhari");
        list.add("krishnahari");
        list.add("gopalhari");
        list.add("shyamhari");
        list.add("ghanashyamhari");

        System.out.println("enter the name");
        String a = scanner.next();
        list.forEach((name)->{
            if(a.equals(name)){
                System.out.println("\nHello  "+name);

            }
            while (!(a.equals(name))){
                System.out.println("Your name "+a+" is not valid");
                System.out.println("You Have To Give The Name Between ");
                list.forEach((names)-> System.out.println(names));
                break;
            }
//            else {
//                System.out.println("Your name "+a+" is not valid");
//                System.out.println("You Have To Give The Name Between ");
//
//            }
//            list.forEach((name123)-> System.out.println(name123));
        });



    }
}
