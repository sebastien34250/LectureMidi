import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import object.Mix;

public class TousInstrumentMute {
	
	private Lecture lect;
	public static final int NOTE_ON = 0x90;
	public static final int NOTE_OFF = 0x80;
	
	public TousInstrumentMute(Lecture lect, Mix mix) {
		this.lect=lect;
		   System.out.println("Tous les instruments sont MUTE");
	       
		   mix.setKick(false);
	       mix.setSnare(false);
	       mix.setHit(false);
	       mix.setCymb(false);
	       mix.setPerc(false);
	       
			   for (Track track :  lect.sequence.getTracks()) {

		           
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		            
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData2();
		                    
		                    if((key!=0)||(key!=64)){  
		                    	try {
		                    		sm.setMessage(NOTE_OFF,9,sm.getData1(),sm.getData2());
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
