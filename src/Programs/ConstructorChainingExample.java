package Programs;

//constructor chaining example

public class ConstructorChainingExample {
    int a;
    String s;
    int b;

    ConstructorChainingExample(){

        System.out.println("Default constructor");
    }

    ConstructorChainingExample(int a, String s){
       this();
        System.out.println("Parameterised constructor");
        this.a = a;
        this.s = s;
        System.out.println(a+"\t"+s);
    }

    ConstructorChainingExample(int a, String s, int b){
     this(a,s);
      System.out.println("another Parameterised constructor");

        this.a = a;
        this.s = s;
        this.b=b;


    }

    public void disp(){
        System.out.println(a+"\t"+s+"\t"+b);

    }
}
