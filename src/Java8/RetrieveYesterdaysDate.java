package Java8;

import java.time.LocalDate;

public class RetrieveYesterdaysDate {

    public static void main(String[] args){

        LocalDate ld = LocalDate.now();
        System.out.println(ld.minusDays(1));
    }
}

/*
Result:-
2024-12-11
 */