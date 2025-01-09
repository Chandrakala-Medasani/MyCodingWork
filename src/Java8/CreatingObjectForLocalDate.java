package Java8;

import java.time.LocalDate;

public class CreatingObjectForLocalDate {

    public static void main(String[] args){

        LocalDate ld = LocalDate.now();

        System.out.println(ld);
        System.out.println("Year = "+ld.getYear());
        System.out.println("Month value = "+ld.getMonthValue());
        System.out.println("Month Name = "+ld.getMonth());
        System.out.println("Day value = "+ld.getDayOfMonth());
        System.out.println("Day Name = "+ld.getDayOfWeek());
    }
}

/*
Result :-
2024-12-12
Year = 2024
Month value = 12
Month Name = DECEMBER
Day value = 12
Day Name = THURSDAY
 */