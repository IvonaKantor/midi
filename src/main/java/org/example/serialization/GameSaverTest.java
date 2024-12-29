package org.example.serialization;
import java.io.*;

public class GameSaverTest {
    public static void main(String[] argc){
        GameCharacter one = new GameCharacter(50, "elf", new String[]{"bow", "sword", "brass knuckles"});
        GameCharacter two = new GameCharacter(50, "troll", new String[]{"bare hands", "hatchet"});
        GameCharacter three = new GameCharacter(50, "magician", new String[]{"spell", "invisibility"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("Type of the first character: " + oneRestore.getType());
            System.out.println("Type of the second character: " + twoRestore.getType());
            System.out.println("Type of the third character: " + threeRestore.getType());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
