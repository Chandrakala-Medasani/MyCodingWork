package Programs;

public class SingleLevelInheritanceParentClass {

    int eno;

    public void display(){

        System.out.println("Hello!! Welcome");

    }

    SingleLevelInheritanceParentClass(){

        System.out.println("Default Constructor");

    }

    SingleLevelInheritanceParentClass(int eno){

        this.eno = eno;
        System.out.println("Parameterised constructor");

    }

}
