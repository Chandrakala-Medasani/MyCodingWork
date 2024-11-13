package Programs;
import java.util.Scanner;

// to check whether the element is present in an array or not

public class ElementExistOrNotInArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int target = scr.nextInt();

        boolean flag = false;

        for(int i=0; i<size; i++)
            if(target == arr[i]){
                flag = true;
                break;
            }

        if(flag == true)
            System.out.println("Element exist");
        else
            System.out.println("Element doesnot exist");

    }
}
