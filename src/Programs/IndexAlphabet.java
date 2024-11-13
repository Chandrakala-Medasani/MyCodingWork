package Programs;

public class IndexAlphabet {
    public static void main(String[] args){
        String st = "chandu";
        System.out.println(st.charAt(4));
        System.out.println(st.charAt(0));
       // System.out.println(st.charAt(40)); --> it gives error because the index is out of bound(StringIndexOutOfBoundException)
    }
}
