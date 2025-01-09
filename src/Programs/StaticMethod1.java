package Programs;

public class StaticMethod1 {

    public static int add(){
        int a = 10;
        int b = 20;
        return a+b;
    }
    public void sum(){
        StaticMethod1.add();
    }

    public static void main(String[] args){

        System.out.print(add());

    }
}
