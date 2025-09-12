package HackerRank;
import java.util.Scanner;

//the array is in sorting order
//returning the index through linear search if the target element is present
// or return the index where the target element can be inserted

public class ReturnTheIndex {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i]=scr.nextInt();

        int target = scr.nextInt();

        for(int i=0; i<n; i++){
            if(target == arr[i])
                System.out.print(i);

            else if(target > arr[i] && target < arr[i+1])
                System.out.print(i+1);
        }

    }
}
