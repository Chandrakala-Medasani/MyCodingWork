package HackerRank;

public class TwoDigitEqualOrNot {

    public static StringBuilder isEqual(String str){
        StringBuilder sb=new StringBuilder(str);
        while(sb.length()>=2){
            for(int i=0;i<sb.length()-1;i++){
                int n= (sb.charAt(i)+sb.charAt(i+1))%10;
                System.out.print(n);
                sb.setCharAt(i,(char)(n));
            }
        }
        return sb;
    }

    public static void main(String[] args){
        String str="1234";
        System.out.println(isEqual(str));
    }
}
