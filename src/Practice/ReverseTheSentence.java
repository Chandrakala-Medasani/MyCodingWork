package Practice;
import java.util.Scanner;

//Input :- My name is chandu
//Output :- chandu is name my

public class ReverseTheSentence {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] rev= str.split(" ") ;

        for(int i=rev.length-1; i>=0; i--)
            if(rev[i].isEmpty() == false)
                System.out.print(rev[i]+" ");

    }
}
