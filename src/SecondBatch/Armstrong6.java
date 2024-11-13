package SecondBatch;

import java.util.Scanner;

public class Armstrong6 {
    public static void main(String[] args){
        Armstrong5 a = new Armstrong5();
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        a.isArmstrong(num);
    }
}
