package SecondBatch;
//without return type and with arguments
public class Prime5 {
    public void isPrime(int num){
        int flag = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i == 0)
                flag++;
        }
        if(flag == 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
