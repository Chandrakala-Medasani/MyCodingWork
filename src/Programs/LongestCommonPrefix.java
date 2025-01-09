package Programs;
import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++)
            str[i]=scr.next();

        Arrays.sort(str);

       // for(int i=0; i<n; i++)
         //   System.out.print(str[i]+"\t");

        String a = str[0], b=str[n-1];
        for(int i=0; i<a.length(); i++)
            if(a.charAt(i) == b.charAt(i))
                System.out.print(a.charAt(i));
    }
}
