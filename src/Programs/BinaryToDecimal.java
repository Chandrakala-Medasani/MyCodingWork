package Programs;
import java.util.*;

//to print binary number to decimal number
//101 ==> 5
//1*2power2+0*2power1+1*2power0 ==> 5

public class BinaryToDecimal {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int dec=0,p=1;

        while(n>0){
            int rem= n%10;
            dec = dec+rem*p;
            p=p*2;
            n=n/10;
        }

        System.out.println(dec);

    }
}


