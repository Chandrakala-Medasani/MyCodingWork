package CollectionsPrograms;
import java.util.*;

//ArrayList allows null values

public class ArrayListWithNullValues {

    public static void main(String[] args){

        List l = new ArrayList();

        l.add(1);
        l.add(null);
        l.add(null);

        //l.add("null");
       // l.add("null");

        System.out.println(l);
    }
}
