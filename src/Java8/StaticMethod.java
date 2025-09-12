package Java8;

@FunctionalInterface
public interface StaticMethod {

     int add(int a ,int b);

    default void display(){
        System.out.println("Helloooo!!!");
    }

    static void print(){
        System.out.println("Hiiiii!!!!");
    }
}
