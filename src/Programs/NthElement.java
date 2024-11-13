package Programs;
import java.util.*;
public class NthElement {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size;i++)
            a[i]=scr.nextInt();
        int n = scr.nextInt();
        System.out.println(a[n]);
    }
}
