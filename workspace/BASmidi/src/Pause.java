import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Pause {
	// La boucle est en train d'être lue, l'utilisateur la met sur pause.
	
	private Lecture lec;
	
	public Pause(Lecture lect){
		this.lec=lect;
		Boolean pause = true;
		while(pause){
		Scanner sc = new Scanner(System.in);
		System.out.println("appuyer sur l ,p ou s");
		String rep= sc.nextLine();
		
		
		
			
		
		if(rep.equals("l")){
			lect.sequencer.getLoopStartPoint();
			lect.sequencer.start();
			
		}
		if(rep.equals("p")){
			lect.sequencer.stop();
			
			lect.sequencer.setLoopStartPoint(lect.sequence.getTickLength());
			System.out.println("reprendre oui ou non ?");
			String rep2 = sc.nextLine();
			
			if(rep2.equals("o")){
				rep="l";
			}
			else{
				pause = false;
			}
		}
		}
	}
		
	

	
}
