package HackerRank;
import java.util.Scanner;

public class Inversion {
    public static int inverted(int size, int[] a){
        int ch = 0;
        for(int i=1; i<size; i++)
            for(int j=0; j<=i; j++)
                if(a[j] > a[i])
                    ch++;
        return ch;

    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i]=scr.nextInt();
        int result = inverted(size,a);
        System.out.println(result);
    }
}
