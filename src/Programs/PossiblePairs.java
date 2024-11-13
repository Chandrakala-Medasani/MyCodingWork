package Programs;
import java.util.Scanner;

public class PossiblePairs {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int target = scr.nextInt();
        int ch = 0;
        for(int i=0; i<size-1; i++)
        {
            if(target > (a[i]*a[i+1]) ){
                ch = 1;
                break;
            }
        }
        if(ch == 1)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
