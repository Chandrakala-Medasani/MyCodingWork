package Programs;
import java.util.*;

//Take numbers from the keyboard until "Enter" is entered

public class EnterNumbers {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int sum=0;
        while(scr.hasNextInt()){
            int num = scr.nextInt();
            sum = sum+num;
        }
        while(true){
            String str = scr.nextLine();
            if(str.equals("enter"))
                break;
        }
        System.out.println("Sum = "+sum);
    }
}
