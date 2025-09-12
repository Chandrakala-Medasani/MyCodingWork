package Java8;

public class StaticMethodImplementation {

//    @Override
//    public int add(int a, int b){
//        return a+b;
//    }

    public static void main(String[] args) {
        //Lambda expression
        StaticMethod sm = (int a, int b)->{
          return a+b;
        };

       // StaticMethodImplementation sm = new StaticMethodImplementation();
        System.out.println(sm.add(10,20));
        sm.display();
        StaticMethod.print();
    }
}
