package Test1;

public class Copy {
    public static void main(String[] args){
        int[] a={10,11,12};
        int[] b = new int[a.length];
        for(int i=0; i<a.length; i++)
            b[i] = a[i];
        System.out.println("Given array: ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        System.out.println("Copy array: ");
        for(int i=0; i<a.length; i++)
            System.out.print(b[i]+"\t");
    }
}
