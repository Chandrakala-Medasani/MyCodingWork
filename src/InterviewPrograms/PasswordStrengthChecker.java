package InterviewPrograms;
import java.util.Scanner;

//Password Strength Checker

public class PasswordStrengthChecker {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String password = scr.next();

        boolean flag = false, upper = false, lower = false, digit = false, special = false;

        if(password.length()<8)
            flag = false;

        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                upper = true;
            if(Character.isLowerCase(ch))
                lower = true;
            if(Character.isDigit(ch))
                digit = true;
            if(Character.isLetterOrDigit(ch))
                special = true;
        }

        if(upper && lower && digit && special)
            System.out.println("The password is strong");
        else
            System.out.println("The password is not strong");
    }
}

/*
Result:-
Chinnu@123
The password is strong

Chinnuuu
The password is not strong




 */
