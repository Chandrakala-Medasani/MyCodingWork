package Programs;

//comparing the strings example

public class CompareExample {

    public static void main(String[] args){

        String s1 = "chandu";

        String s2 = s1.toString();
        System.out.println(s2);

        String s3 = s1.toLowerCase();

        String s4 = s1.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

    }
}
