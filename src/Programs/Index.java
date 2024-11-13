package Programs;
import java.util.*;
public class Index {
        public static void main(String[] args){
            System.out.println("Enter the array size :");
            Scanner scr = new Scanner(System.in);
            int size = scr.nextInt();
            System.out.println("Enter the array values :");
            int[] a = new int[size];
            for(int i=0; i<size; i++)
                a[i] = scr.nextInt();
            System.out.println("Enter the target number :");
            int target = scr.nextInt();
            for(int i=0; i<size; i++){
                for(int j=i+1;j<size;j++){
                     if(target == a[i]+a[j])
                        System.out.print("The indices are : " + i + " " + j);
                }
            }
        }
    }