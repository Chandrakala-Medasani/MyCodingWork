package Day1;
import java.util.*;

public class TemperatureState {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int temp = scr.nextInt();
        if(temp<0)
            System.out.println("Freezing weather");
        else if(temp>0 && temp<10)
            System.out.println("Very cold weather");
        else if(temp>10 && temp<20)
            System.out.println("Cold weather");
        else if(temp>20 && temp<30)
            System.out.println("Normal weather");
        else if(temp>30 && temp<40)
            System.out.println("Hot weather");
        else if(temp>=40)
            System.out.println("Very hot weather");

    }
}
