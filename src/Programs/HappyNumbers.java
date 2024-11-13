package Programs;
import java.util.*;

public class HappyNumbers {

    public static int squareSum(int n){
        int sum = 0;
        while(n>0){
            int rem=n%10;
            sum = sum + rem*rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int res = n;
        while(true){
            res = squareSum(res);
            if(res == 1){
                System.out.println("True");
                break;
            }
            else if(res == n){
                System.out.println("False");
                break;
            }

        }
    }
}
