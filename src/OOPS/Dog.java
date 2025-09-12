package OOPS;

public class Dog extends Mammal{

    public void whoAmI(){
        System.out.println("I'm a dog");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.whoAmI();
    }
}
