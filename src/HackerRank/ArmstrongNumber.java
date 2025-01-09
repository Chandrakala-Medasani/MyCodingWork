package HackerRank;
import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num=scr.nextInt();
        int temp=num;
        int arm=0;
        int nod=0;

        while(num>0){
            nod++;
            num/=10;
        }
        num=temp;
        while(num>0){
            arm=arm+ (int) Math.pow(num%10,nod);
            num/=10;
        }
        if(temp == arm)
            System.out.println("Armstrong");
        else
            System.out.println("Not an armstrong");
    }
}
