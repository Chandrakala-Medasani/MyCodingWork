package Programs;
import java.util.*;
//Swap using 3rd variable
public class Swapping {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping : "+a+"\t"+b);
    }
}
