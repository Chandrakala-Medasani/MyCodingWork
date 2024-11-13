package Programs;
import java.util.*;

public class OppositeReverseRightAnglePattern {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-j; j++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
