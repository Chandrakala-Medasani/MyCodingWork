package Programs;
import java.io.*;

// Program to implement serialisation and deserialisation

public class Serialisation {

    public static void main(String[] args){

        SerialisationPOJO sp = new SerialisationPOJO(5,10);

        String path = "D:/Java/person";
try {
    FileOutputStream f = new FileOutputStream(path);
    ObjectOutputStream o = new ObjectOutputStream(f);
    o.writeObject(sp);
} catch (IOException e) {
    throw new RuntimeException(e);
}
        try {
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream o = new ObjectInputStream(f);
            //o.readObject();
            System.out.println(o.readObject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
