package HackerRank;
import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int max = arr[0];
        int smax = arr[0];

        for(int i=0; i<size; i++){

            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }

            else if(max>arr[i] && smax<arr[i]){
                smax = arr[i];
            }

        }
        if(smax == arr[0])
            System.out.print("There is no second largest number");
        else
            System.out.print(smax);
    }
}

