package Programs;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8};
        int[] c = new int[ a.length + b.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        for (int j = a.length, k = 0; j < a.length + b.length; j++, k++)
            c[j] = b[k];
    }
}
