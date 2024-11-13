package Day1;
import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        if(num>0)
            System.out.println(num+" is positive");
        else if(num<0)
            System.out.println(num+" is negative");
        else
            System.out.println(num+" is zero");
    }
}
