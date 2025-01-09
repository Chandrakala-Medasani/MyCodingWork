package InterviewPrograms;
import java.util.Scanner;

//average of even numbers

public class AverageOfEvenNumbersInArray {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i]=scr.nextInt();

        int count = 0;
        int sum = 0;

        for(int i=0; i<size; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }

        double avg = (sum*1.0)/count;
        System.out.println((double)Math.round(avg*100)/100);
    }
}

/*
Result:-
6
3
4
7
8
10
15
7.33
 */