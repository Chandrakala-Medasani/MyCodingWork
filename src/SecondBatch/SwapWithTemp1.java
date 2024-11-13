package SecondBatch;
//without return type and with arguments
public class SwapWithTemp1 {
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"\t"+b);
    }
}
