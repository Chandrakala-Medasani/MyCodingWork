package Programs;

public class ChanduPattern {

    public static void main(String[] args){

        String str = "CHANDU";

        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++){

            for(int j=0; j<=i; j++)
                System.out.print(ch[j]+" ");

            System.out.println();
        }
    }
}

/*
Result:-
C
C H
C H A
C H A N
C H A N D
C H A N D U

 */