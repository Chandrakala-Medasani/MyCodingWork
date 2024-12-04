package HackerRank;
import java.util.Scanner;


public class SecondsToHoursMinutesSeconds {

    public static String seconds(int sec){

        return String.format("%02d:%02d:%02d",(sec/3600),((sec%3600)/60),((sec%3600)%60));
    }

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int sec = scr.nextInt();

        System.out.println(seconds(sec));

       /* int hours = sec/3600;
        int mins = (sec%3600)/60;
        int secs = (sec%3600)%60;

        System.out.println(hours+" : " +mins+" : " +secs); */

    }
}
