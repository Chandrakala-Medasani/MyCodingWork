package CollectionsPrograms;
import java.util.*;

//ArrayList with Heterogeneous data

public class ArrayListWithHeterogenoeusData {

    public static void main(String[] args){

        List l = new ArrayList();
        l.add(5);
        l.add("Chandu");
        l.add("India");

        System.out.println(l);

        for(int i=0; i< l.size(); i++)
            System.out.println(l.get(i));
    }
}
