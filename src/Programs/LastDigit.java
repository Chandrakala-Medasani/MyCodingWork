package Programs;
import java.util.*;

public class LastDigit {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        int rem=num%10;
        System.out.print(rem);
    }
}
