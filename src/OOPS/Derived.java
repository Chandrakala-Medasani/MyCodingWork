package OOPS;

public class Derived extends Base{

    public void display(){
       num++;
        super.display();
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }

}
