package CollectionsPrograms;
import java.util.*;

//Retrieve Element Based on index?

public class RetrieveElementFromArrayList {

    public static void main(String[] args){

        List l = new ArrayList();

        l.add("A");
        l.add("B");
        l.add("C");

        Scanner scr = new Scanner(System.in);
        int index = scr.nextInt();

        System.out.println(l.get(index));

    }
}
