package SecondBatch;
import java.util.*;

public class Loops {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        //int num = scr.nextInt();
        int target = scr.nextInt();
        for(int i=2; i<=target; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i+"\t");

        }



        //for(int i=10; i>=1; i--)
        //System.out.print(i+" ");

        //int i=1;
        /*while(i>=0){
            System.out.print(i+" ");
            i--;
        }*/

        /*do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);*/


    }
}
