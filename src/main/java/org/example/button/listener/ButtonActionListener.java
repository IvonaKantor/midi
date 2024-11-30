package org.example.button.listener;

import javax.swing.*;
import java.awt.event.*;

public class ButtonActionListener implements ActionListener {

    JButton button;

    public ButtonActionListener(JButton button) {
        this.button = button;
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}

