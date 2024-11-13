package SecondBatch;
//with return type and with arguments
public class SwapWithOutTemp5 {
    public int[] swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        return new int[]{a,b};
    }
}
