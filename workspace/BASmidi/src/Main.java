import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import model.DAOFactory;
import model.daoLoop;
import object.Loop;


public class Main {

	public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		
		
		Choisir();
	}

	private static void Choisir() throws InputMismatchException {
		ArrayList<Object> listf = new ArrayList<>();
		
		
		// On ajoute notre nom et l'état d'avancement de la fonction
		
		listf.add("Afficher les loops");
		listf.add("Choisir une loop");
		listf.add("Changer de loop");
		listf.add("stop");
		listf.add("pause");
		listf.add("lecture en continu");	// Seb: DONE
		listf.add("Mettre un instrument en solo");
		listf.add("Mettre un instrument en mute");
		listf.add("Mettre tous les instruments en marche");
		listf.add("Mettre tous les instruments en mute");
		listf.add("Changer de tempo");
		listf.add("Modifier la loop");
		listf.add("Définir les instruments des pads");
		listf.add("Lire les pads");
		listf.add("Enregistrer la loop modifiée");
		listf.add("Sauvegarder");
		listf.add("Créer un espace client");
		listf.add("Se connecter à l'espace client");
		
		for (int i=0; i<listf.size();i++){
			System.out.println(i + "\t" + listf.get(i).toString());
		}
		
		Scanner scanner = new Scanner(System.in);
		Boolean continuer = true;
		
		try{
			while (continuer){
				int reponse = scanner.nextInt();		
				
				if (reponse == 0){
					ArrayList<Loop> daoLoop = DAOFactory.getDAOLoop().readAll();
					System.out.println(daoLoop.toString());
					
					
				}
				if (reponse == 1){
					new ChoisirLoop();
				}
				if (reponse == 2){
					new ChangerLoop();
				}
				if (reponse == 3){
					new Stop();
				}
				if (reponse == 4){
					
					
					System.out.println("Pour mettre sur pause, appuyer sur la lettre 'p' ?");
					Lecture lect = new Lecture();
					Pause pause = new Pause (lect);
					
					
					
					

					
					
				}
				if (reponse == 5){
					new Lecture();
				}
				if (reponse == 6){
					new InstrumentSolo();
				}
				if (reponse == 7){
					new InstrumentMute();
				}
				if (reponse == 8){
					new TousInstrumentSolo();
				}
				if (reponse == 9){
					new TousInstrumentMute();
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