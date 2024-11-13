package Test1;

public class EvenNumbers {
    public static void main(String[] args){
        int[] arr ={10,11,12,13,14,15,16};
        System.out.println("Even numbers in the given array: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0)
                System.out.print(arr[i]+"\t");
        }
    }
}
