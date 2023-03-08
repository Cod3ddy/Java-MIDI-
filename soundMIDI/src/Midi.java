import javax.sound.midi.*;

public class Midi {
    public void midiSetup () throws MidiUnavailableException, InterruptedException {
       int noteNumber = 8;

        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);


        for (int i =0; i < 127; i ++ )
        {
            System.out.println("Note ::> " + noteNumber);
            channels[0].noteOn(noteNumber, 200);
            Thread.sleep(800);
            channels[0].noteOff(noteNumber);
            noteNumber +=2;

            if (noteNumber > 127)
                break;
        }

    }
    public void C4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(60, 200);
        Thread.sleep(1000);
        channels[0].noteOff(60);
    }
    public void D4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(62, 200);
        Thread.sleep(1000);
        channels[0].noteOff(62);
    }
    public void E4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(64, 200);
        Thread.sleep(1000);
        channels[0].noteOff(64);
    }
    public void F4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(65, 200);
        Thread.sleep(1000);
        channels[0].noteOff(65);
    }
    public void G4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(67, 200);
        Thread.sleep(1000);
        channels[0].noteOff(67);
    }
    public void A4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(69, 200);
        Thread.sleep(1000);
        channels[0].noteOff(69);
    }
    public void B4 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(71, 200);
        Thread.sleep(1000);
        channels[0].noteOff(71);
    }
    public void C5 () throws MidiUnavailableException, InterruptedException {
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        MidiChannel[] channels = synthesizer.getChannels ();
        Instrument [] instruments = synthesizer.getAvailableInstruments();
        synthesizer.loadInstrument(instruments[0]);

        channels[0].noteOn(72, 200);
        Thread.sleep(1000);
        channels[0].noteOff(72);
    }

}
