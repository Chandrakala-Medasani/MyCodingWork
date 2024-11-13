package Programs;
import java.util.*;

//max or min of 2 numbers
public class MinOrMax {
    public static void main(String[] args){
       /* int a=23;
        int b=65;
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b); */

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        if(a>b)
            System.out.println(a+" is largest");
        else
            System.out.println(a+" is smallest");
    }
}
