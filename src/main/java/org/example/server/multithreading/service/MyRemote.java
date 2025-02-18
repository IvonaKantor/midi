package org.example.server.multithreading.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String hello() throws RemoteException;
}
