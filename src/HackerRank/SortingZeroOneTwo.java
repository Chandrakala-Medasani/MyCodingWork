package HackerRank;
import java.util.Scanner;

public class SortingZeroOneTwo {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();

        int[] count = new int[3];


        for(int i=0; i<size; i++)
            count[a[i]]++;

        for(int i=0; i<3; i++)
            for(int j=0; j<count[i]; j++)
                System.out.print(i+" ");

        /*for(int i=0; i<size-1; i++)
            for(int j=0; j<size-1; j++)
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

        for(int i=0; i<size; i++)
            System.out.print(a[i]+" ");*/
    }
}
