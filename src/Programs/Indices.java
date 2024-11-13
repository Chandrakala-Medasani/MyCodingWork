package Programs;

public class Indices {
    public static void main(String[] args){
        int[] a={2,7,11,15};
        int target = 9;
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length; j++){
                if(target == a[i]+a[j])
                    System.out.print(i+"\t"+j);
            }
        }
    }
}
