package Programs;
import java.util.*;

public class OddPyramid {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i ;j++){
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}