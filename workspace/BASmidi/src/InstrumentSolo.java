import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import object.Mix;

public class InstrumentSolo {
	public static final int NOTE_ON = 0x90;
	  public static final int NOTE_OFF = 0x80;
	  public static final int 	KICK1=35, 	KICK2=36,
	  							SNARE1=37,	SNARE2=38,	SNARE3=39, 	SNARE4=40,
	  							HAT1=42, 	HAT2=44, 	HAT3=46,
	  							CYMB1=49, 	CYMB2=51, 	CYMB3=52, 	CYMB4=53, 	CYMB5=55, 	CYMB6=57;
	  private Lecture lect;
	  private Mix mix;
	  private boolean mixSolo;

	   public InstrumentSolo (Lecture lect, Mix mix){
		   this.lect=lect;
		   System.out.println("Mettre instrument en solo: KICK=1, SNARE=2, HAT=3, CYMB=4, PERCS=5");
	       Scanner sc = new Scanner(System.in);
		   int choixSolo=sc.nextInt();
		   mixSolo=false;
		   
		   if(mix.isCymb() && mix.isSnare() && mix.isHit() && mix.isCymb() && mix.isPerc()){
			   mix.setKick(false);
		       mix.setSnare(false);
		       mix.setHit(false);
		       mix.setCymb(false);
		       mix.setPerc(false);
		       mixSolo = true;
		       System.out.println("toutes les pistes marchent");
		   }
		   
		   
		   if(mixSolo){
			   verifier();
		   }
		   
		   
		   
		   if(choixSolo == 1){
			   mix.setKick(true);
			   
			   for (Track track :  lect.sequence.getTracks()) {
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData1();
		                    if((key==KICK1)||(key==KICK2)){  
		                    	
		                    	try {
		                    		sm.setMessage(NOTE_ON,9,sm.getData1(),sm.getData2());
								} catch (InvalidMidiDataException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		                    }
		                 }
		            }
			   }
		   }
		   
		   if(choixSolo ==2){
			   mix.setSnare(true);
			   for (Track track :  lect.sequence.getTracks()) {

		           
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		            
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData1();
		                   
		                    if((key==SNARE1)||(key==SNARE2)||(key==SNARE3)||(key==SNARE4)){ 
		                    	 
		                    	 try {
									sm.setMessage(NOTE_ON,9,sm.getData1(),sm.getData2());
									
								} catch (InvalidMidiDataException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		                    }
		                 }
		            }
			   }
		   }
		   
		   if(choixSolo == 3){
			   mix.setHit(true);
			   for (Track track :  lect.sequence.getTracks()) {

		           
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		            
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData1();
		                    
		                    if((key==HAT1)||(key==HAT2)||(key==HAT3)){  
		                    	
		                    	try {
		                    		sm.setMessage(NOTE_ON,9,sm.getData1(),sm.getData2());
								} catch (InvalidMidiDataException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		                    }
		                 }
		            }
			   }
		   }
		   
		   if(choixSolo == 4){
			   mix.setCymb(true);
			   for (Track track :  lect.sequence.getTracks()) {

		           
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		            
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData1();
		                    
		                    if((key==CYMB1)||(key==CYMB2)||(key==CYMB3)||(key==CYMB4)||(key==CYMB5)||(key==CYMB6)){  
		                    	
		                    	try {
		                    		sm.setMessage(NOTE_ON,9,sm.getData1(),sm.getData2());
								} catch (InvalidMidiDataException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		                    }
		                 }
		            }
			   }
		   }
		   
		   if(choixSolo == 5){
			   mix.setPerc(true);
			   for (Track track :  lect.sequence.getTracks()) {

		           
		            for (int i=0; i < track.size(); i++) { 
		                MidiEvent event = track.get(i);
		            
		                MidiMessage message = event.getMessage();
		                if (message instanceof ShortMessage) {			
		                    ShortMessage sm = (ShortMessage) message;
		                    int key = sm.getData1();
		                    
		                    if(	(key!=KICK1)	&&(key!=KICK2)	&&
				                    (key!=SNARE1)	&&(key!=SNARE2)	&&(key!=SNARE3)	&&(key!=SNARE4)	&&
				                    (key!=HAT1)		&&(key!=HAT2)	&&(key!=HAT3)	&&
				                    (key!=CYMB1)	&&(key!=CYMB2)	&&(key!=CYMB3)	&&(key!=CYMB4)	&&(key!=CYMB5)	&&(key!=CYMB6)
				                  ){


 
		                    	
		                    	try {
		                    		sm.setMessage(NOTE_ON,9,sm.getData1(),sm.getData2());
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


	private void verifier() {
		// On vérifie si tous les instruments sont en marche, si c'est le cas, on les mets tous en mute et on lance l'instrument choisi en solo
		for (Track track :  lect.sequence.getTracks()) {
            for (int i=0; i < track.size(); i++) { 
                MidiEvent event = track.get(i);
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage) {			
                    ShortMessage sm = (ShortMessage) message;
                    int key = sm.getData1();
                    
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