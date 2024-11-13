package Programs;
import java.util.Scanner;

public class PairAList {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i] = scr.nextInt();
        int target = scr.nextInt();
        int ch =0 ;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(target == a[i]+a[j])
                {
                    ch = 1;
                    break;
                }
            }
        }
        if(ch > 0)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
