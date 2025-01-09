package Programs;
import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str=scr.nextLine();
        str = str.toLowerCase();

        char[] ch = str.toCharArray();
        int count = 0;
        int count1 = 0;

        for(int i=0; i<ch.length; i++) {
            if((ch[i]>='a'&&ch[i]<='z'))
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                    count++;
                else
                    count1++;
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
