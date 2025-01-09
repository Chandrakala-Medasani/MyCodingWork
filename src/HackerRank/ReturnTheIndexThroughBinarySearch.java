package HackerRank;
import java.util.Scanner;

//the

public class ReturnTheIndexThroughBinarySearch {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scr.nextInt();

        int target = scr.nextInt();

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid])
                System.out.println(arr[mid]);
            else if (target > arr[mid] && target < arr[mid + 1])
                System.out.println(mid + 1);
        }
    }
}

