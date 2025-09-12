package InterviewPrograms;
import java.util.Scanner;

//Character Check

public class CharacterCheck {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        char ch = scr.next().charAt(0);

        if (Character.isAlphabetic(ch))
            System.out.println(ch + " is character");
        else if (Character.isDigit(ch))
            System.out.println(ch + " is digit");
        else
            System.out.println(ch + " is special character");
    }
}

/*
Result:-
v
v is character

5
5 is digit

@
@ is special character

 */