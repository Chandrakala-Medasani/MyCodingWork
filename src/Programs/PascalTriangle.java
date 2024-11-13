package Programs;
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
                //val = 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    //val = i+j;
                }
                System.out.println();
            }*/

       /* int numRows = 3; // Change this to generate more rows

        for (int row = 0; row < numRows; row++) {
            // Print leading spaces for alignment
            for (int space = 0; space < numRows - row - 1; space++) {
                System.out.print(" ");
            }

            int value = 1; // The first value of each row is always 1
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                // Calculate the next value in the row using the formula
                value = value * (row - col) / (col + 1);
            }
            System.out.println(); // Move to the next line after each row
        }*/

    }
}
