package Test1;
import java.util.*;
public class Buffer {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String str1 = scr.nextLine();
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        if(str.equals(str1))
            System.out.println("Strings are equal");
    }
}
