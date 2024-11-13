package Programs;
import java.util.Scanner;

public class LargestProduct {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
            a[i] = scr.nextInt();
        int product = 1;
        int max = -9999;
        for(int i=0; i<size-1; i++){
            product = a[i]*a[i+1];
            if(max < product)
                max = product;
        }
        System.out.println(max);
    }

}
