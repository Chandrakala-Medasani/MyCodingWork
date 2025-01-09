package StringsPrograms;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        String[] str = new String[size];
        int leastCharsStringIndex = 0;
        for(int i=0; i<size; i++) {
            str[i] = scr.next();
            if(i != 0 && str[i-1].length() > str[i].length()){
                leastCharsStringIndex = i;
            }
        }

        boolean isPrefixNotFound = true;
        String prefix = str[leastCharsStringIndex];
        while (isPrefixNotFound){
            for (int i = 0; i < str.length; i++) {
                if(!str[i].startsWith(prefix)){
                    break;
                }else
                    isPrefixNotFound = false;
            }
            if(isPrefixNotFound){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        if (isPrefixNotFound){
            System.out.println("Prefix not found");
        }else
            System.out.println(prefix);

    }
}
