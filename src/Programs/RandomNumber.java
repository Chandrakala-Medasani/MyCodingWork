package Programs;
import java.util.*;

public class RandomNumber {
    public static void main(String[] args){
        int ran = (int)(Math.random()*11);
        System.out.println(ran);
        Scanner scr = new Scanner(System.in);
        int num ;
        do {
            System.out.println("Guess no :");
            num= scr.nextInt();
            if(num>ran)
                System.out.println("Greater no");
            else if(num<ran)
                System.out.println("less no");
            else
                System.out.println("equal");
        }while(ran==num);
    }
}

