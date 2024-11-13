package methods;

public class SwapWithReturn {
    public static void main(String[] args){
        int[] swr = swap(5,6);
        System.out.println(swr[0]+"\t"+swr[1]);
    }

    public static int[] swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return new int[] {a,b};
    }
}
