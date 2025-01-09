package Programs;
import java.util.Scanner;

public class NoDuplicateElementsInArray {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        boolean flag = false;

        for (int i = 0; i < size; i++) {
            int b = scr.nextInt();
            for (int j = 0; j <= i; j++) {
                if (b == arr[j]) {
                    flag = true;
                    System.out.println("Element exist");
                    break;
                }

            }
            if (!flag){
                arr[i] = b;
            }
        }
        if (flag == false)
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
    }
}



       /* Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        boolean flag = false;

        for(int i=0; i<size; i++) {
            arr[i] = scr.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[j + 1] || arr[i] == arr[j]) {
                    flag = true;
                    System.out.println("Same element exist!!!");
                    break;
                }
            }
        }
        if(flag == false)
            for(int i=0; i<size; i++)
                 System.out.print(arr[i]+" ");


    }
}*/
