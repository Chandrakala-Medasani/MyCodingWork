package SecondBatch;
//with return type and with arguments
public class SwapWithTemp5 {
    public int[] swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[] {a,b};
    }
}
