package Day1;
import java.util.*;


public class Factors {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        for(int i=1; i<=num/2; i++){
            if(num%i==0)
                System.out.println(i);
        }
        System.out.println(num);

    }
}
