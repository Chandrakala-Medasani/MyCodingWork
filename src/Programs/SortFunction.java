package Programs;
import java.util.*;
//To sort the elements in an array
public class SortFunction {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++)
            a[i]=scr.nextInt();
        Arrays.sort(a);
        for(int i=0;i<size;i++)
            System.out.print(a[i]+"\t");
    }
}
