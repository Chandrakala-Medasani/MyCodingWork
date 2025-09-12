package Practice;
import java.util.Scanner;

public class DotProduct {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int size1 = scr.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0; i<size1; i++)
            arr1[i] = scr.nextInt();

        int size2 = scr.nextInt();
        int[] arr2 = new int[size1];
        for(int i=0; i<size1; i++)
            arr2[i] = scr.nextInt();




       /* int size = scr.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int max = arr[0];

        for(int i=0; i<size-1; i++){
            int res = arr[i]*arr[i+1];

            if(max < res)
                max = res;
        }

        System.out.print(max);*/

       /* int size1 = scr.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0; i<size1; i++)
            arr1[i] = scr.nextInt();

        int size2 = scr.nextInt();
        int[] arr2 = new int[size1];
        for(int i=0; i<size1; i++)
            arr2[i] = scr.nextInt();

        int sum = 0;

        if(size1 == size2){

            for(int i=0; i<size1; i++)
                sum = sum + (arr1[i]*arr2[i]);


            System.out.print(sum);
        }*/

    }
}
