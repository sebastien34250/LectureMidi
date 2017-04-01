import java.util.Scanner;

import javax.sound.midi.Sequencer;

public class ChangerTempo {

	private Lecture lect;
	
	
	public ChangerTempo(Lecture lect) {
		this.lect=lect;
		System.out.println("Entrer le nouveau tempo : ");
		Scanner sc = new Scanner(System.in);
		int choixTempo = sc.nextInt();
		setTempo(choixTempo);
	}
	
	public void setTempo(float fBPM)
	{
		float fCurrent = lect.sequencer.getTempoInBPM();
	    float fFactor = fBPM / fCurrent;
	    lect.sequencer.setTempoFactor(fFactor);
	}
}
