package org.example.server.multithreading.service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public String hello() {
        return "Server says : hello";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("hello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
