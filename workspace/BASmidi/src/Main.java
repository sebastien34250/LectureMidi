import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Main {

	public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		
		Choisir();
	}

	private static void Choisir() throws InputMismatchException {
		ArrayList<Object> list = new ArrayList<>();
		
		// On ajoute notre nom et l'état d'avancement de la fonction
		
		list.add("Afficher les loops");
		list.add("Choisir une loop");
		list.add("Changer de loop");
		list.add("stop");
		list.add("pause");
		list.add("lecture");	// Seb: DONE
		list.add("Mettre un instrument en solo");
		list.add("Mettre un instrument en mute");
		list.add("Mettre tous les instruments en marche");
		list.add("Mettre tous les instruments en mute");
		list.add("Changer de tempo");
		list.add("Modifier la loop");
		list.add("Définir les instruments des pads");
		list.add("Lire les pads");
		list.add("Enregistrer la loop modifiée");
		list.add("Sauvegarder");
		list.add("Créer un espace client");
		list.add("Se connecter à l'espace client");
		
		for (int i=0; i<list.size();i++){
			System.out.println(i + "\t" + list.get(i).toString());
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
					new ChoisirLoop();
				}
				if (reponse == 2){
					new ChangerLoop();
				}
				if (reponse == 3){
					new Stop();
				}
				if (reponse == 4){
					
					
					
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
		}
		
		finally {
			System.out.println("Réponse inconnue, veuillez recommencer");
			Choisir();
		}

	}

}