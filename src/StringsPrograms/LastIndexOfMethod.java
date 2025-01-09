package StringsPrograms;
import java.util.Scanner;

public class LastIndexOfMethod {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char c = sc.next().charAt(0);

        System.out.println(str.lastIndexOf(c));

    }
}
