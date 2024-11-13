package Programs;

public class PrimeOneToHundred {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            count = 0;
            for(int num=1;num<=i;num++) {
                if ( i%num == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i +"\t");
        }
    }
}
