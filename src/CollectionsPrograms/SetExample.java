package CollectionsPrograms;
import java.util.*;

public class SetExample {

    public static void main(String[] args){

        Set s = new HashSet();
        s.add("A");
        s.add("B");
        s.add(null);
        s.add("A");
        s.add(null);

        System.out.print(s);

        //for(String st : s)

    }
}
