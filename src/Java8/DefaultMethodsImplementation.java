package Java8;

public class DefaultMethodsImplementation implements DefaultMethods{

    @Override
    public int add(){
        int a=5,b=10;
        return a+b;
    }

    public static void main(String[] args) {

        DefaultMethodsImplementation dm = new DefaultMethodsImplementation();
        dm.add();
        dm.display();

    }
}
