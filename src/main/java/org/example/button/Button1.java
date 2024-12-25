package org.example.button;
import javax.swing.*;
import java.awt.*;

public class Button1 {

    public static void main(String[] argc){
        Button1 gui = new Button1();
        gui.go();
    }

    public void go_east(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void go_north(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
