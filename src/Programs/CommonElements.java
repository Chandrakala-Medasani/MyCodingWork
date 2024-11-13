package Programs;
import java.util.Scanner;

//to print the common elements from 2 arrays

public class CommonElements {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < size; i++)
            a[i] = scr.nextInt();

        int size1 = scr.nextInt();

        int[] b = new int[size1];

        for (int i = 0; i < size1; i++)
            b[i] = scr.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);

                }
            }
        }
    }
}

