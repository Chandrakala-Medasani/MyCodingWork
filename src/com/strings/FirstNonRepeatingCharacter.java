package com.strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        System.out.println(firstNonRepeatChar(str));
    }

  public static String firstNonRepeatChar(String str) {
      for (int i = 0; i < str.length(); i++) {
          if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
              return Character.toString(str.charAt(i));
          }
//           char ch = str.charAt(i);
//            int count = 0;
//            for(int j=0; j<str.length(); j++){
//                if(ch==str.charAt(j))
//                    count++;
//            }
//            if(count==1)
//                return ch;
      }
//        return ' ';
      return "No non repeating Character";
  }
}
