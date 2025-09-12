package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Chandu");
        l.add("Abhi");
        l.add("Bhargav");
        l.add("Ram");

        ListIterator<String> li = l.listIterator();
        while(li.hasNext()){
            System.out.println("Index = "+li.nextIndex()+" Value = "+li.next());
        }

        while(li.hasPrevious()){
            System.out.println("Index = "+li.previousIndex()+" Value = "+li.previous());
        }
    }
}
