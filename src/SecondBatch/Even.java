package SecondBatch;
import java.util.*;

public class Even {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        for(int i=1; i<=num; i++)
            if(i%2 == 1)
                System.out.print(i+" ");

    }
}
