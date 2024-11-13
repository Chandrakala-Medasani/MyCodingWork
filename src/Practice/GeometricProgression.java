package Practice;
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int r = scr.nextInt();
        int n = scr.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + a;
            a = a*r;
        }
        System.out.println(sum);
    }
}
