package CollectionsPrograms;
import java.util.*;

//ArrayList allows Duplicate values

public class ArrayListWithDuplicates {

    public static void main(String[] args){

        List l = new ArrayList();

        l.add("VJ");
        l.add(5);
        l.add("Chandu");
        l.add("VJ");
        l.add(5);
        l.add("Chandu");

        System.out.println(l);
    }
}
