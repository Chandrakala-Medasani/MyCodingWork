package Programs;

import java.io.Serializable;

public class SerialisationPOJO implements Serializable {

    private int x;
    private int y;

    SerialisationPOJO(int x, int y){
        this.x = x;
        this.y= y;
    }

    @Override
    public String toString() {
        return "SerialisationPOJO { X : " + x + " and Y : " + y + " }";
    }
}
