package HackerRank;
import java.util.Scanner;

public class PangramOrNot {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        int count = 0;

        /*for(int i=0; i<ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z' && ch[i]<=' ')
                count++;
        }*/ // --> this is wrong approach

        for (char i= 'a'; i <= 'z'; i++){
            for (char cha: ch){
                if(cha == i){
                    count++;
                    break;
                }
            }
        }

        if(count == 26)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
