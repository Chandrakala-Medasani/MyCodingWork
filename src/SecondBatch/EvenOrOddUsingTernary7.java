package SecondBatch;
import java.util.*;
//with return type and without arguments
public class EvenOrOddUsingTernary7 {
    public String isEven(){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        String s = (num%2==0)?"Even":"Odd";
        return s;
    }
}
