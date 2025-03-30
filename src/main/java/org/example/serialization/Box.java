package org.example.serialization;

import java.io.*;

public class Box implements Serializable {

    public void setWidth(int w) {
    }

    public void setHeight(int h) {
    }

    public static void main(String[] argc) {

        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
