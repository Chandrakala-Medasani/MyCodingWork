package SecondBatch;

import java.util.Scanner;
//without return type and without arguments
public class Prime7 {
    public void isPrime() {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int flag = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                flag++;
        }
        if (flag == 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}

