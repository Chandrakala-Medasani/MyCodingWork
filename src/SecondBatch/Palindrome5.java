package SecondBatch;
//without return type and with arguments

public class Palindrome5 {
    public void isPalin(int num){
        int rev = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
