package org.example.animation;

import org.example.beatB.MyDrawPanel;

import javax.swing.*;

public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            panel.repaint();

            try {
                Thread.sleep(100);
            } catch (Exception ignored) {
            }
        }
    }
}


