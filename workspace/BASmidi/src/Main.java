import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Patch;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Transmitter;
import javax.sound.midi.VoiceStatus;
import javax.sound.midi.MidiDevice.Info;

public class Main {

	public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException{
		
		Choisir();
		
	}

	private static void Choisir() throws InputMismatchException {
		ArrayList list = new ArrayList<>();
		list.add("Afficher les loops");
		list.add("Choisir une loop");
		list.add("Changer de loop");
		list.add("stop");
		list.add("pause");
		list.add("lecture");
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
				
				if (reponse == 1){
					new LireMidi();
				}
				else if (reponse ==2){
					System.out.println("test 2");
				}
				else {
					continuer=false;
				}
			}
		}
		
		finally {
			System.out.println("Réponse inconnue, veuillez recommencer");
			Choisir();
		}

	}

}