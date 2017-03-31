import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Soundbank;

import model.DAOFactory;
import object.Loop;

public class Lecture {
	
	private static final int LOOP_CONTINUOUSLY = -1;
	// La boucle est lue.
	private Loop loop;
	public File boucle ;		
	public Sequence sequence ;
	public Sequencer sequencer;
	public Soundbank sound;
	
	public Lecture (Loop loop){
		this.loop=loop;
		 boucle = 			ChoisirBoucle();		
		 sequence = 	DéfinirSequence(boucle);
		 sequencer = 	LireSequence(sequence);
	}

	

	private File ChoisirBoucle() {
//		// Choix du fichier

		String choix ="LOOP/"+loop.getLoop_name();
		File boucle = new File(choix);
		return boucle;
	}
	
	private Sequence DéfinirSequence(File boucle) {
		// La séquence est définie par le fichier
		Sequence sequence = null;
		
		try {
			
			try {
				sequence = MidiSystem.getSequence(boucle);
		//	sound =	MidiSystem.getSoundbank(boucle);
			} 
			
			catch (InvalidMidiDataException e) {
				e.printStackTrace();
			}

		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return sequence;
	}

	private Sequencer LireSequence(Sequence sequence) {
		// On met la séquence dans le séquenceur et on lance le séquenceur
		Sequencer sequencer = null;
		
		try {
			sequencer = MidiSystem.getSequencer();
			
		}
		catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
		
		
		try {
			sequencer.open();
		} 
		catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
		
		
		try {
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(LOOP_CONTINUOUSLY);
		} 
		catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		
		
		sequencer.start();
		return sequencer;
	}
}
