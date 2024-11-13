package Practice;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i]=scr.nextInt();
        for(int i=0; i<size-1; i++)
            for(int j=0; j<size-1; j++)
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
        for(int i=0; i<size; i++)
            System.out.print(a[i]+"\t");

    }
}
