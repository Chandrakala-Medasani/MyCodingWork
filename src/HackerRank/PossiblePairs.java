package HackerRank;
import java.util.Scanner;

public class PossiblePairs {
    public static boolean product(int size, int[] a, int target){
        for(int i=0;i<size;i++)
            for(int j=i+1;j<size;j++)
                if(a[i]*a[j] > target)
                    return true;

        return false;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int target = scr.nextInt();
        boolean result = product(size,a,target);
        System.out.println(result);
    }
}
