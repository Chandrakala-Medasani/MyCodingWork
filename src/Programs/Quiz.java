package Programs;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("WELCOME TO QUIZ !!");
        System.out.println("Enter how many questions u want to solve this today : ");
        int n = scr.nextInt();
        int res, score = 0;
        for(int i=0; i<n;i ++) {
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            int op = (int) (Math.random() * 4);
            switch (op) {
                case 0:
                    System.out.println(a + " + " + b + " = ?");
                    res = scr.nextInt();
                    if (res == (a + b)) {
                        System.out.println("Correct answer");
                        score++;
                    } else
                        System.out.println("Wrong answer");
                    break;
                case 1:
                    System.out.println(a + " - " + b + " = ?");
                    res = scr.nextInt();
                    if (res == (a - b)) {
                        System.out.println("Correct answer");
                        score++;
                    } else
                        System.out.println("Wrong answer");
                    break;
                case 2:
                    System.out.println(a + " * " + b + " = ?");
                    res = scr.nextInt();
                    if (res == (a * b)) {
                        System.out.println("Correct answer");
                        score++;
                    } else
                        System.out.println("Wrong answer");
                    break;
                case 3:
                    System.out.println(a + " / " + b + " = ?");
                    res = scr.nextInt();
                    if (res == (a / b)) {
                        System.out.println("Correct answer");
                        score++;
                    } else
                        System.out.println("Wrong answer");
                    break;
            }
        }

        System.out.println(score);
    }
}
