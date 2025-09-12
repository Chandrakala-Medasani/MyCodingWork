package Java8;

import java.time.LocalDate;

public class RetrieveTomorrowsDate {

    public static void main(String[] args){

        LocalDate ld = LocalDate.now();
        System.out.println(ld.plusDays(3));
    }
}

/*
Result:-
2024-12-13
 */