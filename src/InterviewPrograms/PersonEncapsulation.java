package InterviewPrograms;

public class PersonEncapsulation {

    public static void main(String[] args){

        Person p = new Person();
        p.setName("Chandu");
        p.setAge(27);
        p.setCountry("India");

        System.out.println(p.getName()+"  "+p.getAge()+"  "+p.getCountry());
    }
}
