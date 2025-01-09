package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTheElementsInList {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int sum = 0;

//        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i=0; i<size; i++){
            int n = scr.nextInt();
//            al.add(n);
//            sum = sum + al.get(i);
            sum = sum + n;
        }

        System.out.println(sum);

    }
}
