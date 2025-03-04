package org.example.server.multithreading.servlets;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class DayOfTheWeekService implements Service {

    JLabel outputLabel;
    JComboBox month;
    JTextField day;
    JTextField year;

    public JPanel getGuiPanel() {

        JPanel panel = new JPanel();
        JButton button = new JButton("click it");
        button.addActionListener(new DoItListener());
        outputLabel = new JLabel("data appears");
        DateFormatSymbols dataStuff = new DateFormatSymbols();
        month = new JComboBox(dataStuff.getMonths());
        day = new JTextField(8);
        year = new JTextField(8);
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Month"));
        inputPanel.add(month);
        inputPanel.add(new JLabel("Day"));
        inputPanel.add(day);
        inputPanel.add(new JLabel("Year"));
        inputPanel.add(year);
        panel.add(button);
        panel.add(outputLabel);
        panel.add(inputPanel);
        return panel;
    }

    public class DoItListener implements ActionListener {
    }
}
