package Programs;
import java.util.Scanner;

public class EvenNumbersSumInArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int sum = 0;
        for(int i=0; i<size; i++)
            if(arr[i]%2 == 0)
                sum = sum + arr[i];

        System.out.println(sum);
    }
}
