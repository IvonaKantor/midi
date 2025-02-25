package org.example.server.multithreading.servlets;

import java.rmi.*;

public interface ServiceServer extends Remote {
    Object[] getServices() throws RemoteException;

    Service getService(Object name) throws RemoteException;
}
