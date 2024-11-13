package Test1;
import java.util.*;

public class ArrayExample {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scr.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();
        System.out.println("The elements are: ");
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+"\t");
    }
}
