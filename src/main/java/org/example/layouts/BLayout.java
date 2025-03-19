package org.example.layouts;

import javax.swing.*;
import java.awt.*;

public class BLayout {
    public static void main(String[] argc) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
