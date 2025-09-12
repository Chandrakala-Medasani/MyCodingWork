package com.encapsulation;

public class Student {

    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && !name.trim().isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Name cannot be null");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=5 && age<=100)
            this.age = age;
        else
            throw new IllegalArgumentException("Invalid age");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email!=null && email.contains("@") &&
        email.contains(".")&&email.indexOf("@")<email.lastIndexOf("."))
                this.email = email;
        else
            throw new IllegalArgumentException("Invalid mail");
    }
}
