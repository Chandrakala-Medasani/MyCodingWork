package Programs;
import java.util.*;

//convert decimal number to binary number

public class DecimalToBinary {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        StringBuffer sb = new StringBuffer();

        while(n>0){
            int rem = n%2;
            sb.append(rem);
            n/=2;
        }

        System.out.print(sb.reverse());

    }
}


