package Programs;

public class InsertElementAtTheEnd {

    public static void main(String[] args){

        int[] arr = new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=5;

        int x=7;
        try{
            int count=0;
            for(int i=0;i<arr.length;i++) {
                if (arr[i] != 0)
                    count++;
            }
            arr[count]=x;
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+"\t");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }
}
