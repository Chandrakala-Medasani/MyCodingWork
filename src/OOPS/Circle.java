package OOPS;

public class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("Drawing circle");
    }

    public static void main(String[] args){

        Circle c = new Circle();
        c.draw();
    }
}
