package Programs;
import java.util.*;

//to print binary pattern
//1
//0 1
//1 0 1
//0 1 0 1

public class BinaryPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        int val =0;

        for(int i=1; i<=n; i++){
            if(i%2 == 1)
               val = 1;
            else
                val =0 ;
            for(int j=1; j<=i; j++){
                if(val%2 == 1)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
                 val++;
            }

            System.out.println();

        }
    }
}
