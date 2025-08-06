package OOPS;

public class Employee extends Person {

    double salary;

    Employee(String name, int age, double salary){
        super(name, age);
        this.salary=salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Chandu",27,100000.00);

        System.out.println(emp.name+" "+emp.age+" "+emp.salary);
    }

}
