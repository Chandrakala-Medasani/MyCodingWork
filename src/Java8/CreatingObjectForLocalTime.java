package Java8;

import java.time.LocalTime;

public class CreatingObjectForLocalTime {

    public static void main(String[] args){

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println("Hours = "+lt.getHour());
        System.out.println("Minutes = "+lt.getMinute());
        System.out.println("Seconds = "+lt.getSecond());
    }
}

/*
Result:-
11:17:35.712630100
Hours = 11
Minutes = 17
Seconds = 35
 */
