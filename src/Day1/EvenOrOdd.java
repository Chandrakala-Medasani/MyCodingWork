package Day1;
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
