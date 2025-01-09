package Programs;

public class ExampleForStatic {
    {
        System.out.println("Gopi");
    }

    static{
        System.out.println("Hello");
    }

    public static void main(String[] args){

        System.out.println("World");
        ExampleForStatic obj=new ExampleForStatic();

    }
}
