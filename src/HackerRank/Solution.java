package HackerRank;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        int currentPrimeNum = 2;
        boolean flag = true;
        String primeNums = "";
        while(flag){
            boolean isDivided = false;
            if(num != 0 && num%currentPrimeNum == 0){
                num = num/currentPrimeNum;
                primeNums += currentPrimeNum;
                isDivided = true;
                if(num == 1){
                    flag = false;
                }
            }else{
                isDivided = false;
            }

            if(!isDivided){
                currentPrimeNum = getNextPrimeNum(currentPrimeNum);
            }
        }
        for(int i= 0; i< primeNums.length(); i++){
            System.out.println(primeNums.charAt(i));
        }

    }

    public static int getNextPrimeNum(int currentPrimeNum){
        int primeNum = currentPrimeNum + 1;
        boolean isPrime = true;
        while(primeNum < (currentPrimeNum + currentPrimeNum)){
            for(int i=2; i<= primeNum/2; i++){
                if(primeNum % i == 0){
                    isPrime = false;
                }
                if(!isPrime){
                    break;
                }
            }
            if(!isPrime){
                primeNum += 1;
                isPrime = true;
            }else{
                break;
            }
        }
        return primeNum;
    }
}