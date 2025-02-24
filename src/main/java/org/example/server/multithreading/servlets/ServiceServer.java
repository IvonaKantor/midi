package org.example.server.multithreading.servlets;
import java.rmi.*;
import java.security.Provider;

public interface ServiceServer extends Remote {
    Object[] getServices() throws RemoteException;
    Provider.Service getService(Object name) throws RemoteException;
}
