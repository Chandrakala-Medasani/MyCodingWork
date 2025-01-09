package InterviewPrograms;
import java.util.Scanner;

//binary pattern

public class BinaryPattern {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               // if((i+j)%2==0)
                //    System.out.print("1");
              //  else
                //    System.out.print("0");
                System.out.print((i+j+1)%2);
            }
            System.out.println();
        }
    }
}

/*
Result:-
4
1010
0101
1010
0101
 */