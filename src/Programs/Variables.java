package Programs;

public class Variables {

    int x;
    int y;

    Variables(){ //default constructor
        System.out.println("This is default constructor");
    }

    Variables(int x){
        this();
        this.x=x;
        System.out.println(x);
    }

    Variables(int x, int y){ //parameterised constructor
        this(x);
       this.x = x;
       this.y = y;

       System.out.println(x);
       System.out.println(y);
    }

    public void display(){
        System.out.println(x);
    }

}
