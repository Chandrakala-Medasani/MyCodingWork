package Day1;
import java.util.*;

public class EligibilityForVote {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        if(age<18)
            System.out.println("Not eligible for voting");
        else
            System.out.println("U r eligible for voting");
    }
}
