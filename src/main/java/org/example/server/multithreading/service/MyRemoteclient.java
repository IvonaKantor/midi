package org.example.server.multithreading.service;
import java.rmi.*;

public class MyRemoteclient {

    public static void main(String[] args) {
        new MyRemoteclient().go();
    }

    public void go(){

        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");

            String s = service.hello();
            System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
