package SecondBatch;
//without return type and with arguments
public class ReverseNumber3 {
    public void reverse(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
