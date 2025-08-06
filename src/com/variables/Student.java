package com.variables;

public class Student {

    String name;
    int age;
    static String schoolName = "FAANG";

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void studentDetails(){
        System.out.println("Name = "+name+" Age = "+age+" School Name = "+schoolName);
    }

    public static void main(String[] args) {
        Student st = new Student("Chandu", 16);
        st.studentDetails();
    }
}
