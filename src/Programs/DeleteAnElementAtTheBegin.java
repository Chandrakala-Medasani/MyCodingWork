package Programs;

public class DeleteAnElementAtTheBegin {

    public static void main(String[] args){

        int[] arr = new int[10];
        arr[0]=6;
        arr[1]=7;
        arr[2]=2;
        arr[3]=3;

        int count=0;
        for(int num : arr){
            if(num!=0)
                count++;
            else
                break;
        }
        for(int i=0; i<count; i++)
            arr[i]=arr[i+1];

        count--;

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"\t");

    }
}