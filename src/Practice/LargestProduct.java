package Practice;
import java.util.Scanner;

public class LargestProduct {
    public static int largest(int size, int a[]){
        int max = -9999, product = 0;
        for(int i=0; i<size-1; i++)
            product = a[i]*a[i+1];
            if(max < product)
                max = product;
        return max;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int max = largest(size,a);
        System.out.println(max);

    }
}
