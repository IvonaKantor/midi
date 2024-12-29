package org.example.filewrite_read;
import java.io.*;

public class WriteAFile {
    public static void main(String[] argc){

        try{
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Hello, foo :)");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
