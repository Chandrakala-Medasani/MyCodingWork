package Programs;
import java.util.Scanner;

//to print average value of an array

public class AverageOfAList {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int sum = 0;

        int[] array = new int[size];

        for(int i=0; i<size; i++)
            array[i] = scr.nextInt();

        for(int i=0; i<size; i++)
            sum+=array[i];

        double d = sum/size;

        System.out.println(d);

    }
}
