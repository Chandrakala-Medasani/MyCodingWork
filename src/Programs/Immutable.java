package Programs;

final class Immutable {
    private int i;
    Immutable(int i){
        this.i = i;
    }

    public Immutable modify(int i){
        if(this.i == i)
            return this;
        else
            return new Immutable(i);
    }

    public static void main(String[] args){
        Immutable im1 = new Immutable(10);
        Immutable im2 = im1.modify(100);
        Immutable im3 = im1.modify(10);

        System.out.println(im1 == im2);
        System.out.println(im1 == im3);
    }
}
