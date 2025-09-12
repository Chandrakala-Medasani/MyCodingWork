package examplesofenum;

public class Main {

    public static void main(String[] args) {
        Day[] day = Day.values();
        for(Day d : day)
            System.out.println(d);

//        for(Day d : Day.values())
//            System.out.println(d);
    }
}
