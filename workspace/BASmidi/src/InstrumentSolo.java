import java.io.File;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class InstrumentSolo {
	public static final int NOTE_ON = 0x90;
	  public static final int NOTE_OFF = 0x80;

	   private Lecture lect;

	   
	       // Sequence sequence = MidiSystem.getSequence(new File("LOOP/police.mid"));
	        
	        
	        
	   public    InstrumentSolo (Lecture lect){
		   
		   this.lect=lect;
		   
		   int trackNumber = 0;
	        for (Track track :  lect.sequence.getTracks()) {
	            trackNumber++;
	           
	            for (int i=0; i < track.size(); i++) { 
	                MidiEvent event = track.get(i);
	            
	                MidiMessage message = event.getMessage();
	                if (message instanceof ShortMessage) {
	                    ShortMessage sm = (ShortMessage) message;
	                    
	                    int key = sm.getData1();
	                    if(key!=36){  // kick
	                    	try {
								sm.setMessage(NOTE_OFF,9,9,9);
							} catch (InvalidMidiDataException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	                    	
	                    }
	                  
	        
	   }
	            }
	              
}
}
}