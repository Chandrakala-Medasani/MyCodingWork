package Day1;
import java.util.*;

public class GradesOfStudent {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int marks = scr.nextInt();
        if(marks>90)
            System.out.println("A Grade");
        else if(marks>80 && marks<90)
            System.out.println("B Grade");
        else
            System.out.println("c Grade");
    }
}
