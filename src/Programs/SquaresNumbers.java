package Programs;
import java.util.Scanner;

public class SquaresNumbers {

    public static int isSquare(int n){
        for(int i=0; i*i<=n; i++)
            if(i*i == n)
                return n;
        return -1;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        for(int i=0; i<size; i++) {
            int res = isSquare(a[i]);
            if (res != -1)
                System.out.print(isSquare(a[i])+"\t");
        }
    }
}
