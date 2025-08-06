package HackerRank;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int size = scr.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        int j=0;

        for(int i=0; i<size; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        for(int i=0; i<size; i++)
            System.out.print(arr[i]+"\t");
    }
}
