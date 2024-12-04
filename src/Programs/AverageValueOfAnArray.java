package Programs;
import java.util.*;

//to print average value of an array

public class AverageValueOfAnArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = scr.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
            a[i]=scr.nextInt();

        int sum =0 ;

        for(int i=0; i<size;i++)
            sum = sum + a[i];

        double avg = sum/size;

        System.out.println(avg);
    }
}
