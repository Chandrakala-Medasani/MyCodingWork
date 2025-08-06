package Programs;

public class InsertElementAtSpecificPosition {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0]=6;
        arr[1]=4;
        arr[2]=7;
        arr[3]=2;

        int x = 9;
        int pos=2;

        try{
            int count=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0)
                    count++;
            }
            for(int i=count;i>pos;i--)
                arr[i]=arr[i-1];

            arr[pos]=x;
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i]+"\t");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }

    }
}
