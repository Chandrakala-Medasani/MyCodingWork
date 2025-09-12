package Programs;

public class TwoDArray {

    public static void main(String[] args){
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{4,5};
        System.out.println(arr[1][1]);
    }
}
