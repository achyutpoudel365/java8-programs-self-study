package com.company.streams_map_examples;

public class ListOfObjectsStaffPublic {
    private String name;
    private int age;
    private String extra;

    public ListOfObjectsStaffPublic() {
        this.name = name;
        this.age = age;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getAge() + ", " + this.getExtra();
    }
}
