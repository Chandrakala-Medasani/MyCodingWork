package Programs;
import java.util.*;

public class Important {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a city name: ");
        String name = scr.nextLine().toLowerCase().trim();
        if(name.equals("hyderabad"))
            System.out.println("Hello hyderabadi, aadaab");
        else if(name.equals("chennai"))
            System.out.println("Hello chennai, vanakkam");
        else if(name.equals("bangalore"))
            System.out.println("Hello kannadiga, namaskara");
        else
            System.out.println("Enter valid city name");
    }
}
