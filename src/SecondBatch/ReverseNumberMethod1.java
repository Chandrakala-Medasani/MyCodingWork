package SecondBatch;
//with return type and with arguments
public class ReverseNumberMethod1 {
    public int reverse(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        return rev;
    }

}
