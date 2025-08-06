package OOPS;

public class Calculator {

    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.multiply(5,6));
        System.out.println(c.multiply(8,9,3));

    }
}
