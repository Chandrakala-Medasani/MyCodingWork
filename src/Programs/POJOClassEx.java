package Programs;
import java.util.*;

public class POJOClassEx {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        //String color = scr.nextLine();
        int age = scr.nextInt();
        String name = scr.nextLine();
        String color = scr.nextLine();
        POJOClass p = new POJOClass();
        p.setAge(age);
        System.out.println(p.getAge());
        p.setName(name);
        System.out.println(p.getName());
        p.setColor(color);
        System.out.println(p.getColor());

    }
}
