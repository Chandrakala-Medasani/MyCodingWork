package SecondBatch;
import java.util.*;
//without return type and without arguments
public class EvenOrOddUsingTernary1 {
    public void isEven(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        String s = (num%2==0)?"Even":"odd";
        System.out.println(s);
    }
}
