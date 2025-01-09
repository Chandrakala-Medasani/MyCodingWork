package Exceptions;

public class LuggageValidation {

    public void getValidate(int luggage) throws InvalidLuggageException{

        if(luggage<15)
            System.out.print("Ready to fly");

        else
            throw new InvalidLuggageException("The luggage is over weight. So this cannot be approved");

    }
}
