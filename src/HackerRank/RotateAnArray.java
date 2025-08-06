package HackerRank;
import java.util.*;

public class RotateAnArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        int temp=arr[size-1];

        for(int i=size-1; i>0; i--)
            arr[i]=arr[i-1];

        arr[0]=temp;

        for(int x:arr)
            System.out.print(x+" ");

    }
}
