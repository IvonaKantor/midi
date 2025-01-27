package org.example;
import java.util.*;
import java.io.*;

public class JukeBox {

    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args){
        new JukeBox().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
    }

    void getSongs(){
        try{
            File file = new File("Songs.txt");
            BufferedReader reader   = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception e){
            e.printStackTrace(); }
    }

    void addSong(String lineToParse){
        String[] tokes = lineToParse.split("/");
        songList.add(tokes[0]);
    }
}
