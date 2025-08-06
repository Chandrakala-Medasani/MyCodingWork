package StringsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        char[] ch = str.toCharArray();

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(Character temp : ch)
            hs.add(temp);
        System.out.println(hs);




//        for(int i=0; i<str.length(); i++){
//            int count=0;
//            for(int j=0; j<str.length(); j++){
//                if(str.charAt(i)==str.charAt(j)&&i!=j)
//                    count++;
//            }
//            if(count==0)
//                System.out.print(str.charAt(i)+" ");
//        }

    }
}
