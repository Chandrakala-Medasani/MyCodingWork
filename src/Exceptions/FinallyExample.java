package Exceptions;

public class FinallyExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if (a < 0) {

            try {
                int res = a / b;
                System.out.println(res);

            } catch (ArithmeticException ae) {
                System.out.println("Number cannot be divided with zero");
            } finally {
                System.out.println("Hii!! Finally");
            }
        }
    }
}

