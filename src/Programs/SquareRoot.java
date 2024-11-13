package Programs;
import java.util.*;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            if (i * i >= n) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}

