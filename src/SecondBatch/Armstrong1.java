package SecondBatch;
//with return type and with arguments
public class Armstrong1 {
    public String isArmstrong(int num){
        int temp = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev + rem * rem *rem;
            num = num/10;
        }
        if(temp == rev)
            return "Armstrong Number";
        else
            return "Not Armstrong Number";
    }
}
