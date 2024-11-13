package SecondBatch;
import java.util.Scanner;

//Convert integer number to roman number

public class IntegerToRoman {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        String[] str ={"M","CM","D","CD","C","XC","l","XL","X","IX","V","IV","I"};
        int[] rom ={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        int i=0;
        String str1="";

        while(num>0){

            if(num>=rom[i]){

                str1 = str1+str[i];
                num = num - rom[i];

            }

            else
                i++;

        }

        System.out.println(str1);

    }
}
