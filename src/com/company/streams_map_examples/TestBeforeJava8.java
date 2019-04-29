package com.company.streams_map_examples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestBeforeJava8 {
    public static void main(String[] args) {

//        before using java 8

        List<ListOfObjectsStaff> staffList = Arrays.asList(
                new ListOfObjectsStaff("Achyut", 22, new BigDecimal(80000)),
                new ListOfObjectsStaff("Nabin", 25, new BigDecimal(75000)),
                new ListOfObjectsStaff("Aditya", 23, new BigDecimal(65000)),
                new ListOfObjectsStaff("Ujjwal", 24, new BigDecimal(70000))
        );

        List<ListOfObjectsStaffPublic> result = convertTOListOfObjectsStaffPublic(staffList);
        System.out.println(result);





//        Using Java 8

//        convert inside the map() method directly
        List<ListOfObjectsStaffPublic> resultNext = staffList.stream().map(temp ->{
            ListOfObjectsStaffPublic obj  = new ListOfObjectsStaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("Achyut".equals(temp.getName())){
                obj.setExtra("This field is only for Mr. Achyut Poudel");
            }
            return obj;
        }).collect(Collectors.toList());

        System.out.println(resultNext);

    }



    private static List<ListOfObjectsStaffPublic> convertTOListOfObjectsStaffPublic(List<ListOfObjectsStaff> staffList) {
        List<ListOfObjectsStaffPublic> resultlist = new ArrayList<>();

        for (ListOfObjectsStaff staff : staffList){

            ListOfObjectsStaffPublic staffPublicObject = new ListOfObjectsStaffPublic();

            staffPublicObject.setName(staff.getName());
            staffPublicObject.setAge(staff.getAge());

            if ("Achyut".equals(staff.getName())){
                staffPublicObject.setExtra("This field is for Achyut only");
            }
            resultlist.add(staffPublicObject);

        }
        return resultlist;
    }
}
