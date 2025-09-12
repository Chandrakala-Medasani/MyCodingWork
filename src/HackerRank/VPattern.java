package HackerRank;
import java.util.Scanner;

public class VPattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Outer loop for rows (5 rows)
        for (int i = 0; i < n; i++) {
            // Inner loop for spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop for stars and spaces
            for (int j = 0; j < n - i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }

