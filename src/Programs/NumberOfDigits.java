package Programs;
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        num = Math.abs(num);
        int count = 0;
        if(num == 0) {
            count = 1;
            System.out.println(count);
        }
        else {
            while (num > 0) {
                count++;
                num /= 10;
            }
            System.out.println(count);
        }

    }
}
