package org.example.beatB;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println(" We have got sequencer");
        }catch(MidiUnavailableException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
