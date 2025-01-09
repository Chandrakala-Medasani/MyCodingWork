package StringsPrograms;

public class ValueOfMethod {

        public static void main(String[] args)
        {
            String s1="10";
            String s2="90";
            Integer n1=Integer.valueOf(s1);
            Integer n2=Integer.valueOf(s2);

            System.out.println(n1);
            System.out.println(n2);

            Integer sum=n1+n2;
            System.out.println(sum);

        }
    }

