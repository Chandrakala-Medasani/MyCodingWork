package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int i=0; i < num; i++){
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        num = num-1;
        for (int i=num; i >= 0; i--){
            for (int j = 0; j <= (num-i +1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
