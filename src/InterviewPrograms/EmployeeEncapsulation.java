package InterviewPrograms;

//Write a Java program to create a class called Employee
// with private instance variables employee_id, employee_name, and employee_salary.
// Provide public getter and setter methods to access and modify the id and name variables,
// but provide a getter method for the salary variable that returns a formatted string.

public class EmployeeEncapsulation {

    public static void main(String[] args){

        Employee e = new Employee();

        e.setId(55);
        e.setName("Chandu");
        e.setSalary(5000000.00f);

        System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());


    }
}
