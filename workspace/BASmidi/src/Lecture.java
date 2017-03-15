import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Lecture {
	
	private static final int LOOP_CONTINUOUSLY = -1;
	// La boucle est lue.
	
	File boucle = 			ChoisirBoucle();		
	Sequence sequence = 	DéfinirSequence(boucle);
	Sequencer sequencer = 	LireSequence(sequence);
	
	
	private File ChoisirBoucle() {
		// Choix du fichier
		String choix = null;
		System.out.println("1=909, 2=dance, 3=pop");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero == 1){
			choix = "909kit_01.mid";
		}
		else if (numero ==2){
			choix = "loop.mid";
		}
		else {
			choix ="fpc_Pop_01.mid";
		}
//		sc.close();
		File boucle = new File(choix);
		return boucle;
	}
	
	private Sequence DéfinirSequence(File boucle) {
		// La s�quence est d�finie par le fichier
		Sequence sequence = null;
		
		try {
			
			try {
				sequence = MidiSystem.getSequence(boucle);
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
