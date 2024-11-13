package Programs;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int f1=0;
        int f2=1;
        int sum=0;
        System.out.print(f1+"\t"+f2+"\t");
        for(int i=1;i<=num;i++) {
            sum = f2 + f1;
            f1 = f2;
            f2 = sum;
            System.out.print(sum+"\t");
        }
    }
}
