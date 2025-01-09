package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListTraversal {

    public static void main(String[] args){

        List l = new ArrayList();
        l.add(2);
        l.add(5);
        l.add(1);
        l.add(5);
        l.add(null);

        System.out.println(l);

        for(Object o : l)
            System.out.println(o);
    }
}
