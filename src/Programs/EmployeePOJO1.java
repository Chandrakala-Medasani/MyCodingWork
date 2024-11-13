package Programs;

public class EmployeePOJO1 {
    public static void main(String[] args){
        EmployeePOJO ep = new EmployeePOJO();
        ep.setEno(25);
        System.out.println(ep.getEno());
        ep.setName("Tarak");
        System.out.println(ep.getName());
        ep.setSalary(25000.00);
        System.out.println(ep.getSalary());
    }
}
