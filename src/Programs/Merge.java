package Programs;
import java.util.*;
public class Merge {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int size1 = scr.nextInt();
        int[] a = new int[size1];
        System.out.println("Enter first array elements : ");
        for(int i=0;i<size1;i++)
            a[i] = scr.nextInt();
        System.out.println("Enter second array size : ");
        int size2 = scr.nextInt();
        int[] b = new int[size2];
        System.out.println("Enter second array elements : ");
        for(int i=0;i<size2;i++)
            b[i] = scr.nextInt();
        int[] c = new int[size1+size2];
        System.out.println("The final array is : ");
        for(int i=0;i<a.length;i++)
            c[i]=a[i];
        for(int j=a.length,k=0;j<a.length+b.length;j++,k++)
            c[j]=b[k];
        for(int i=0;i<a.length+b.length;i++)
            System.out.print(c[i]+"\t");
    }
}
