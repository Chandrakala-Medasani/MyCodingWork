package Programs;

public class StaticMethod2 {

    static int a;
    static int b;

    public static void main(String[] args){
       // System.out.print(StaticMethod1.add());
        StaticMethod2 s = new StaticMethod2();
        System.out.print(a);
        System.out.print(b);
        s.disp();
    }

    public void disp(){
        System.out.print(StaticMethod2.a);
        System.out.print(StaticMethod2.b);
    }

}
