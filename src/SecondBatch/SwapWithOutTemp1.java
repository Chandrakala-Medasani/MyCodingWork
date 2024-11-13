package SecondBatch;
//without return type and with arguments
public class SwapWithOutTemp1 {
    public void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+"\t"+b);
    }
}
