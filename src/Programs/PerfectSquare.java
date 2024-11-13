package Programs;
import java.util.*;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int ch=0;
        for(int i=1; i<=n; i++){
            if(i*i == n){
                ch =1;
                System.out.println("yes");
                break;
            }
            else if(i*i>n)
                break;
        }
        if(ch == 0)
            System.out.println("no");
    }
}
