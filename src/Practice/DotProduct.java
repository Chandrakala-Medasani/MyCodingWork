package Practice;
import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int size1 = scr.nextInt();
        int[] b = new int[size1];
        for(int i=0; i<size1; i++)
            b[i] = scr.nextInt();
        int sum = 0;
        if(size == size1)
            for(int i=0; i<size; i++)
                sum += a[i]*b[i];
        System.out.println(sum);

    }
}
