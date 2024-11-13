package SecondBatch;
//with return type and with arguments
public class Prime1 {
    public String isPrime(int num){
        int flag = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i == 0)
                flag++;
        }
        if(flag == 1)
            return "Prime";
        else
            return "Not Prime";
    }
}
