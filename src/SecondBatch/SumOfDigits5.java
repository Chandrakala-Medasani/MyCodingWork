package SecondBatch;
//without return type and with arguments
public class SumOfDigits5 {
    public void sum(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
