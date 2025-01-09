package InterviewPrograms;

public class BankAccountEncapsulation {

    public static void main(String[] args){

        BankAccount b = new BankAccount();
        b.setAccountNumber(54789);
        b.setBalance(50000000);

        System.out.println(b.getAccountNumber()+"  "+b.getBalance());
    }
}
