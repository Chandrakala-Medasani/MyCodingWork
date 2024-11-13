package SecondBatch;
import java.util.*;

public class SumOfArray {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
            a[i]=scr.nextInt();
        for(int i=0; i<size; i++)
            sum = sum+a[i];
        System.out.println(sum);
    }
}
