import java.io.File;
import java.io.IOException;


import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

import javax.sound.midi.Sequence;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Track;


class Instruments {

    public static void main(String[] args) throws MidiUnavailableException {
   	//String choix ="LOOP/Evid.mid";
  //  	String choix ="LOOP/africa.mid";
    	String choix ="LOOP/shortPolice.mid";
		File boucle = new File(choix);
		Soundbank sound=null;
	//	 sequence = null;
		
		
		try {
			
			try {
				Sequence	sequence = MidiSystem.getSequence(boucle);
				Track [] tracks = sequence.getTracks();
				
				for ( int i = 0; i < tracks.length; i++ ) {
				      System.out.println( "Track " + i + ":" );
				      Track track = tracks[ i ];
				      for ( int j = 0; j < track.size(); j++ ) {
				       MidiEvent event = track.get( j );
				     System.out.println (" tick "+ event.getTick() + ", " + 
				           MessageInfo.toString( event.getMessage() ) );
				    } // for
				    } // for
				
				
			} 
			
			catch (InvalidMidiDataException e) {
				e.printStackTrace();
			}

		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		if (sound == null)
		{
			System.out.println("no soundbank");
			
		}

		
				
    }
    }
