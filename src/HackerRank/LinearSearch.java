package HackerRank;
import java.util.Scanner;


public class LinearSearch {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int target = scr.nextInt();

        for(int i=0; i<size; i++)
            if(target == a[i])
                System.out.println(i);

    }
}
