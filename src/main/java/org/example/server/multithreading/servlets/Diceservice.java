package org.example.server.multithreading.servlets;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Diceservice implements Service{
    JLabel label;
    JComboBox numOfDice;

    public JPanel getGuiPanel(){
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll 'em!");
        String[] choices = {"1", "2", "3", "4", "5"};
        numOfDice = new JComboBox(choices);
        label = new JLabel("dice values here");
        button.addActionListener(new RollEmListener());
        panel.add(numOfDice);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    public class RollEmListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String diceOutput = " ";
            String selection = (String) numOfDice.getSelectedItem();
            assert selection != null;
            int numOfDiceToRoll = Integer.parseInt(selection);
            for (int i = 0; i < numOfDiceToRoll; i++) {
                int r = (int) (Math.random() * 6) + 1;
                diceOutput += r + " ";
            }
            label.setText(diceOutput);
        }
    }
}
