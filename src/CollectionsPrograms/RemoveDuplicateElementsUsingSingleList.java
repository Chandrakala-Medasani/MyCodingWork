package CollectionsPrograms;
import java.util.ArrayList;


public class RemoveDuplicateElementsUsingSingleList {

    public static void main(String[] args){

        ArrayList l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(2);
        l.add(1);

        for(Object i : l){
            if(l.contains(i))
                l.remove(i);
        }

        System.out.print(l);
    }
}
