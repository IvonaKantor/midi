package org.example.button;
import org.example.layouts.BorderLayout;

import javax.swing.*;
import java.awt.event.*;

public class InnerButton {

    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("A");
        button.addActionListener(new Blistener());
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(200,100);
        frame.setVisible(true);
    }

    class Blistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(button.getText().equals("A")){
                button.setText("B");
            }else{
                button.setText("A");
            }
        }
    }
}
