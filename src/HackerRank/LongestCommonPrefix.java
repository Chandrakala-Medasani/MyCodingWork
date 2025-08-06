package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        String[] str = new String[n];

        for(int i=0; i<n; i++)
            str[i] = scr.next();

        Arrays.sort(str);
        String a = str[0], b = str[n-1];

        for(int i=0; i<=a.length()&&i<=b.length(); i++)
            if(a.charAt(i)==b.charAt(i))
                System.out.print(b.charAt(i));

        else
            break;
    }
}
