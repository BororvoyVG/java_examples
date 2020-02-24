package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileOutputStream output = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(output);
        TestSerial testSerial = new TestSerial();

        oos.writeObject(testSerial);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestSerial ts = (TestSerial) ois.readObject();
        System.out.println(ts.version);
    }
}

class TestParrent implements Serializable {

}

class TestSerial extends TestParrent {

    public transient byte version = 100;
    public transient byte count = 0;


}
