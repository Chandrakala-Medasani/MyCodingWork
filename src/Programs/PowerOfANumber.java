package Programs;
import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int p =scr.nextInt();
        int result = 1;
        for(int i=1; i<=p; i++){
            result = result * num;
        }
        System.out.println(result);
    }
}