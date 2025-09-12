package HackerRank;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static int isFrequency(String str, char ch){

        int count = 0;
        for(int i=0; i<str.length(); i++)
            if(ch == str.charAt(i))
                count++;

        return count;
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.next();

        for(int i=0; i<str.length(); i++)
            if(isFrequency(str,str.charAt(i))==1){
                System.out.print(str.charAt(i));
                break;
            }

    }
}
