package Programs;

public class InsertElementAtTheBegin {

    public static void main(String[] args){

        int[] arr = new int[4];
        arr[0]=10;
        arr[1]=5;
        arr[2]=4;
        arr[3]=15;

        int x = 2;
        try {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0)
                    count++;
            }
            for (int i = count; i > 0; i--)
                arr[i] = arr[i - 1];

            arr[0] = x;
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]+"\t");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }
}
