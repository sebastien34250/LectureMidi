import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import model.daoLoop;
import object.Loop;
import object.Mix;


public class Main {

	
	//static Loop choixLoop; 
	static ChoisirLoop choisirLoop;
	static Lecture lect;
	static Mix mix;
	
	public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		
		
		Choisir();
	}

	private static void Choisir() throws InputMismatchException {
		ArrayList<Object> listf = new ArrayList<>();
		
		
		// On ajoute notre nom et l'état d'avancement de la fonction
		
		listf.add("Afficher les loops");				// DONE
		listf.add("Choisir une loop");					// DONE
		listf.add("Changer de loop");					//
		listf.add("stop");								// DONE
		listf.add("pause");								// DONE
		listf.add("lecture en continu");				// DONE
		listf.add("Mettre un instrument en solo");		// DONE
		listf.add("Mettre un instrument en mute");		// DONE
		listf.add("Mettre tous les instruments en marche"); // DONE
		listf.add("Mettre tous les instruments en mute");	// DONE
		listf.add("Changer de tempo");					//
		listf.add("Modifier la loop");					//
		listf.add("Définir les instruments des pads");	//
		listf.add("Lire les pads");						//
		listf.add("Enregistrer la loop modifiée");		//
		listf.add("Sauvegarder");						//
		listf.add("Créer un espace client");			// 
		listf.add("Se connecter à l'espace client");	// 
		
		for (int i=0; i<listf.size();i++){
			System.out.println(i + "\t" + listf.get(i).toString());
		}
		
		Scanner scanner = new Scanner(System.in);
		Boolean continuer = true;
		
		try{
			while (continuer){
				int reponse = scanner.nextInt();		
				
				if (reponse == 0){
					new AfficherLoop();	
				}
				if (reponse == 1){
//					int choixLoop;
					choisirLoop= new ChoisirLoop();
				}
				if (reponse == 2){
					 new ChangerLoop();
				}
				if (reponse == 3){
					new Stop();
				}
				if (reponse == 4){
					System.out.println("Pour mettre sur pause, appuyer sur la lettre 'p' ?");
					Pause pause = new Pause (lect);
				}
				if (reponse == 5){
					mix = new Mix(true,true,true,true,true);
					lect=	new Lecture(choisirLoop.daoLoop);
				}
				if (reponse == 6){
					InstrumentSolo instrSolo = new InstrumentSolo(lect,mix);
				}
				if (reponse == 7){
					InstrumentMute instrMute = new InstrumentMute(lect,mix);
				}
				if (reponse == 8){
					TousInstrumentSolo tousInstruSolo = new TousInstrumentSolo(lect,mix);
				}
				if (reponse == 9){
					TousInstrumentMute tousInstruMute = new TousInstrumentMute(lect,mix);
				}
				if (reponse == 10){
					new ChangerTempo();
				}
				if (reponse == 11){
					new ModifierLoop();
				}
				if (reponse == 12){
					new DéfinirPads();
				}
				if (reponse == 13){
					new LirePads();
				}
				if (reponse == 14){
					new EnregistrerLoop();
				}
				if (reponse == 15){
					new Sauvegarder();
				}
				if (reponse == 16){
					new CréerEspaceClient();
				}
				if (reponse == 17){
					new SeConnecterEspaceClient();
				}
				
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Réponse inconnue, veuillez recommencer");
			Choisir();
		}

	}

}