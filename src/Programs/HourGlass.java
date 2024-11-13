package Programs;
import java.util.*;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
                System.out.print("* ");

            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
                System.out.println();
            }
        }

}
