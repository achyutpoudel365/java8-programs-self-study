package com.company.java8_comparator;

public class Student {

    private String name;

    private String gender;

    public Student(String name,String gender) {
        this.name = name;

        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "name of the student is ::  "+this.getName()+", his/her Gender is :: "+this.getGender();
    }
}
