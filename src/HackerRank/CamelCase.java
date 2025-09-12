package HackerRank;
import java.util.Scanner;

//Input:- saveChangesInTheEditor
//Output:- 5

public class CamelCase {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.next();

        int count=1;

        for(int i=0; i<str.length(); i++)
            if(Character.isUpperCase(str.charAt(i)))
                count++;

        System.out.println(count);
    }
}
