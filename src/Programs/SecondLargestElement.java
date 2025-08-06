package Programs;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int max1 = -9999, max2 = -9999;

        for(int i=0; i<size; i++){

            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }

            else if(max1>arr[i] && max2<arr[i])
                max2 = arr[i];
        }

        if(max2==-9999)
            System.out.println("No second largest element");
        else
            System.out.println(max2);
    }
}
