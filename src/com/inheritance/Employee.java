package com.inheritance;

public class Employee extends Person {
    int salary;
    Employee(String name, int age,int salary){
        super(name,age);
        this.salary=salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee("Candy",25,100000);
        System.out.println("Name = "+e.name+" Age = "+e.age+" Salary = "+e.salary);
    }
}
