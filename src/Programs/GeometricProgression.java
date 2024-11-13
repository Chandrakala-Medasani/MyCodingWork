package Programs;
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int r = scr.nextInt();
        int n = scr.nextInt();
        int sum=1, term =1;
        for(int i=2; i<=n; i++){
            term *= r;
            sum += term;
        }
        sum *= a;
        System.out.println(sum);
    }
}
