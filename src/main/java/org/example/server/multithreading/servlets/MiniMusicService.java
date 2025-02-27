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
        JButton playItButton = new JButton("Play It");
        playItButton.addActionListener(new PlayItListener());
        mainPanel.add(myPanel);
        mainPanel.add(playItButton);
        return mainPanel;
    }

    public class PlayItListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            try{
                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();

                sequencer.addControllerEventListener(myPanel, new int[]{127});
                Sequence seq = new Sequence(Sequence.PPQ, 4);
                Track track = seq.createTrack();

                for(int i = 0; i<100; i+=4){}
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
