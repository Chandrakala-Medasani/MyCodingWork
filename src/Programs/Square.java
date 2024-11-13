package Programs;
import java.util.*;

public class Square {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}
