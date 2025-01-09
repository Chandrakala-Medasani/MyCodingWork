package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTraversal {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        ArrayList al = new ArrayList();

        for(int i=0; i< size; i++){
            int n = scr.nextInt();
            al.add(n);
        }

        System.out.println(al);

    }
}
