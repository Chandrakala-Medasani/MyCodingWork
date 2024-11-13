package SecondBatch;
//without return type and with arguments
public class Armstrong5 {
    public void isArmstrong(int num){
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
