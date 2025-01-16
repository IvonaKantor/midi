package org.example.server.multithreading.server;
import java.io.*;
import java.net.*;
import java.util.*;

public class SimplierChat {

    ArrayList clienOutputStreams;

    public class ClientHandler implements Runnable{

        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket){
            try{
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public void run(){

            String message;
            try{
                while((message = reader.readLine()) != null){
                    System.out.println("read" + message);
                    tellEveryone(message);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        new SimplierChat().go();
    }

    public void go(){
        clienOutputStreams = new ArrayList();
        try{
            ServerSocket serverSock = new ServerSocket(5000);

            while(true){
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clienOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void tellEveryone(String message){
        Iterator it = clienOutputStreams.iterator();
        while(it.hasNext()){
             try{
                PrintWriter writer = (PrintWriter)it.next();
                writer.println(message);
                writer.flush();
             }catch(Exception e){
                 e.printStackTrace();
             }
        }
    }
}
