package Java8;

public class FunctionallInterfaceImplementation {

    public static void main(String[] args) {

        Chandu c = (a,b) -> a+b;

        System.out.println(c.display(10,20));
    }
}
