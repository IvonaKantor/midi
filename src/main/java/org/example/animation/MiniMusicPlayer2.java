package org.example.animation;

import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 60; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void controlChange(ShortMessage event) {
        System.out.println("la");
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int thick) {
        return MiniMusicPlayer1.makeEvent(comd, chan, one, two, thick);
    }
}













