package Programs;
import java.util.*;

public class StriingExample {
    public static void main(String[] args){
       /* String s = "Mohan";
        s.concat("Chandu");
        System.out.println(s);// Mohan
        String s1 =  s.concat("Chandu");
        System.out.println(s1); // MohanChandu

        StringBuffer sb = new StringBuffer("Mohan");
        sb.append("Chandu");
        System.out.println(sb); //MohanChandu

        String st = new String("Mohan");
        st.concat("Chandu");
        System.out.println(st);// Mohan
        String st1 =  s.concat("Chandu");
        System.out.println(st1); // MohanChandu */

       /* Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str.concat("Chandu");
        System.out.println(str);
        String str1 = str.concat("Chandu");
        System.out.println(str1);*/


        String s = new String("VJ");
        String s1 = new String("VJ");
        String s2 = new String("VJ");

        System.out.println(s==s1);
        System.out.println(s1 == s2);
        System.out.println(s.equals(s1));

    }
}
