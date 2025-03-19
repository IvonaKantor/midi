package org.example.layouts;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
        gui.box_lay();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }

    public void box_lay() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
