package methods;
import java.util.*;

public class Swap {
    public static void main(String[] args){
        Swap s = new Swap();
        s.swap(5,6);
    }

    public void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+"\t"+b);
    }
}
