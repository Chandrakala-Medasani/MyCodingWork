package SecondBatch;
//with return type and with arguments
public class Palindrome1 {
    public String isPalin(int num){
        int rev = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(temp == rev)
           return "palindrome";
        else
            return "not palindrome";
    }

}
