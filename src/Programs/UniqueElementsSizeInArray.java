package Programs;
import java.util.*;

public class UniqueElementsSizeInArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];


        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        int count=0;

        for(int i=0; i<size-1; i++)
                if(arr[i]!=arr[i+1])
                    count++;

        System.out.println(count+1);

    }
}
