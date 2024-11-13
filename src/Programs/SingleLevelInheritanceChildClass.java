package Programs;

public class SingleLevelInheritanceChildClass extends SingleLevelInheritanceParentClass {

    String name;

    public void method(){

        System.out.println("Hello!! I'm Child class");
        System.out.println(name);

    }

    SingleLevelInheritanceChildClass(){

        System.out.println("child class default constructor");

    }

    SingleLevelInheritanceChildClass(String name){

       // this();
        this.name = name;
        System.out.println("Child class parameterised constructor");

    }

}
