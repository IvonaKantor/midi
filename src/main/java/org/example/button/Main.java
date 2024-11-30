package org.example.button;

import org.example.button.listener.ButtonActionListener;

import javax.swing.*;

public class Main  extends JPanel{
    public static void main(String[] args) {
        final var frame = new JFrame();
        final var button = new JButton("click me");

        ButtonActionListener actionListener = new ButtonActionListener(button);
        button.addActionListener(actionListener);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
