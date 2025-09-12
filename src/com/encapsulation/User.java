package com.encapsulation;

public class User {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age cannot be lessthan zero");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.trim().isEmpty()) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name cannot be null");
        }

    }
}
