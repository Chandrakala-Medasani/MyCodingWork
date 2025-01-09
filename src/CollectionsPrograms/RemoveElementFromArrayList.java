package CollectionsPrograms;
import java.util.*;

//Remove Element based on index?

public class RemoveElementFromArrayList {

    public static void main(String[] args){

        List l = new ArrayList();

        l.add("A");
        l.add("C");
        l.add(null);
        l.add("A");

        Scanner scr = new Scanner(System.in);
        int index = scr.nextInt();

        System.out.println(l.remove(index));

        System.out.println(l);
    }
}
