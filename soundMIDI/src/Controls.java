import javax.sound.midi.MidiUnavailableException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controls {
    public void inputKey(String key)
    {

        while(true) {

            Midi playNote = new Midi();
            Scanner getKey = new Scanner(System.in);
            System.out.print("Enter Key :  ");
            key = getKey.nextLine();

            if (key.equals("z")) {
                try {
                    System.out.print("playing C4.....\n");
                    playNote.C4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("x")) {
                Midi getD4 = new Midi();
                try {
                    System.out.print("playing D4.....\n");
                    playNote.D4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("c")) {
                try {
                    System.out.print("playing E4.....\n");
                    playNote.E4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("v")) {
                try {
                    System.out.print("playing F4.....\n");
                    playNote.F4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("b")) {
                try {
                    System.out.print("playing G4.....\n");
                    playNote.G4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("n")) {
                try {
                    System.out.print("playing A4.....\n");
                    playNote.A4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("m")) {
                try {
                    System.out.print("playing B4.....\n");
                    playNote.B4();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals(",")) {
                try {
                    System.out.print("playing C5.....\n");
                    playNote.C5();
                } catch (InterruptedException | MidiUnavailableException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (key.equals("stop"))
            {
                System.exit(0);
            }
        }

    }

}
