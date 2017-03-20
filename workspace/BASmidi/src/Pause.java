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
	//private static final int LOOP_CONTINUOUSLY = -1;
	
	private Lecture lec;
	
	
	public Pause(Lecture lect){
		this.lec=lect;
		
		Boolean relecture = true;
		Scanner sc = new Scanner(System.in);
		
		String rep= sc.nextLine();

	
	
while(relecture){		
		if(rep.equals("p")){
			
			lec.sequencer.stop();
		
		
			
			
			System.out.println("pour reprendre appuyer sur la lettre 'o' ?");
			//Scanner sc2 = new Scanner(System.in);
			String rep2 = sc.nextLine();

			if(rep2.equals("o")){
			
				lec.sequencer.setTickPosition(lec.sequencer.getTickPosition());
			//	lec.sequencer.setLoopStartPoint(lec.sequencer.getTickPosition());
				lec.sequencer.start();
				
			
				System.out.println("appuyer p pour mettre pause");
				rep= sc.nextLine();
			
			}
		
			
		}
		else{
			
		System.out.println("lecture du morceau terminé");
			relecture= false;
		}

	}
		
	}

	
}
