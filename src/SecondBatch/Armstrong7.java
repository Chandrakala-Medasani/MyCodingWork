package SecondBatch;
import java.util.Scanner;
//with return type and without arguments
public class Armstrong7 {
    public void isArmstrong(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev + rem * rem *rem;
            num = num/10;
        }
        if(temp == rev)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
