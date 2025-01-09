package Exceptions;

public class AgeValidation {

    public void getValidate(int age) throws InvalidAgeException{
        if(age>18)
            System.out.print("Eligible to vote");
        else
            throw new InvalidAgeException("Not eligible to vote");
    }
}
