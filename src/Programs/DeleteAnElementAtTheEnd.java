package Programs;

public class DeleteAnElementAtTheEnd {

    public static void main(String[] args){

        int[] arr = new int[10];

        arr[0]=10;
        arr[1]=5;
        arr[2]=7;
        arr[3]=3;

        int count = 0;

        for(int num : arr){
            if(num!=0)
                count++;
            else
                break;
        }
        arr[count-1]=0;
        count--;

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"\t");
    }
}
