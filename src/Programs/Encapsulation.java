package Programs;
import java.util.Scanner;

//example for encapsulation

public class Encapsulation {

    private int no;
    private String name;
    private String location;

    Encapsulation(int no, String name, String location){

        this.no = no;
        this.name = name;
        this.location = location;
    }

    public void display(){

        System.out.println(no+" "+name+" "+location+" ");
    }

}
