package HackerRank;
import java.util.Scanner;

public class BinarySearch {
    public static int binary(int size, int[] a, int target){
        int left = 0, right = size-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (target == a[mid])
                return mid;
            else if (target > a[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int target = scr.nextInt();
        int result = binary(size,a,target);
        System.out.println(result);
    }
}



