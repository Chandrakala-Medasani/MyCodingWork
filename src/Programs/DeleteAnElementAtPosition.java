package Programs;

public class DeleteAnElementAtPosition {

    public static void main(String[] args){

        int[] arr = new int[10];

        arr[0]=5;
        arr[1]=2;
        arr[2]=7;
        arr[3]=10;

        int count=0;
        int pos =2;

        for(int num : arr){
            if(num!=0)
                count++;
            else
                break;
        }
        for(int i=pos-1; i<count; i++)
            arr[i]=arr[i+1];

        count--;

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"\t");
    }
}
