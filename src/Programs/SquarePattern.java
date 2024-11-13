package Programs;
import java.util.*;

public class SquarePattern {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
