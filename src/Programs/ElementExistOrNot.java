package Programs;
import java.util.*;

//whether the element exist in an array

public class ElementExistOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size=scr.nextInt();

        int[] a = new int[size];

        for(int i=0;i<size;i++)
            a[i]=scr.nextInt();

        int temp=scr.nextInt();

        boolean flag = false;

        for(int i=0;i<size;i++) {

            if (temp == a[i]) {

                flag = true;
                break;

            }
        }

        if(flag == true)
                System.out.println("Element exist");
            else
                System.out.println("Element doesnot exist");


    }
}
