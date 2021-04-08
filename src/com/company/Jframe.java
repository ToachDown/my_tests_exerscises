package com.company;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class Jframe{
    static JFrame frame = new JFrame("мой первый музыкальный клип");
    static MyDrawPanel m1;

    public static void main(String[] args){
        Jframe mini = new Jframe();
        mini.go();
    }

    public void setUpGui(){
        m1 = new MyDrawPanel();
        frame.setContentPane(m1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);
    }

    public void go() {

        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(m1,new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 120; i += 4) {
                r = (int)((Math.random()*50)+1);

                track.add(makeEvent(144, 1, r, 100, i));

                track.add(makeEvent(176, 1, 127, 0, i));

                track.add(makeEvent(144, 1, r, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(140);
            sequencer.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {}
        return event;
    }

    public class MyDrawPanel extends JPanel implements ControllerEventListener{
        boolean msg = false;

        public void controlChange(ShortMessage event){
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g){
            if(msg) {
                Graphics2D g2d = (Graphics2D) g;

                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                g.setColor(new Color(red, green, blue));

                int ht = (int)((Math.random()*120)+10);
                int width = (int)((Math.random()*120)+10);
                int x = (int)((Math.random()*40)+10);
                int y = (int)((Math.random()*40)+10);
                g.fillRect(x,y,ht,width);
                msg = false;
            }
        }
    }
}
