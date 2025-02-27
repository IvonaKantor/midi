package org.example.server.multithreading.servlets;
import org.example.beatB.MyDrawPanel;

import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniMusicService implements Service{
    MyDrawPanel myPanel;

    public JPanel getGuiPanel(){
        JPanel mainPanel = new JPanel();
        myPanel = new MyDrawPanel();
    }
}
