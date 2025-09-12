package com.collections.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();

        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
                s.push(ch);

            else {
                if(s.isEmpty()){
                    System.out.println("False");
                    return;
                }
                char c = s.pop();
                if((c!='(' && ch==')')||
                        (c!='[' && ch==']')||
                        (c!='{' && ch=='}'))
                    System.out.println("False");
            }
        }
        if(s.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
