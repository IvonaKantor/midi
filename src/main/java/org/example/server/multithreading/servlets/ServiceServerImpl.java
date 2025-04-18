package org.example.server.multithreading.servlets;

import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    HashMap serviceList;

    public ServiceServerImpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() throws RemoteException {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new Diceservice());
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new MiniMusicService());
    }

    public Object[] getServiceList() {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Object[] getServices() throws RemoteException {
        return new Object[0];
    }

    public Service getService(Object serviceKey) throws RemoteException {
        Service service = (Service) serviceList.get(serviceKey);
        return service;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
}
