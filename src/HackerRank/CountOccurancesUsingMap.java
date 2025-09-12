package HackerRank;
import java.util.*;

public class CountOccurancesUsingMap {

    public static void main(String[] args){

        Map<Integer,Integer> m = new HashMap<>();

        Scanner scr = new Scanner(System.in);

        int size = scr.nextInt();

        for(int i=0; i<size; i++){
            int a = scr.nextInt();
            if(m.get(a) == null)
                m.put(a,1);
            else
                m.put(a,m.get(a)+1);
        }
    }
}
