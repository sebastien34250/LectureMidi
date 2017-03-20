import java.util.ArrayList;

import model.*;
import object.*;

public class AfficherLoop {

	// Cette fonction permet de retourner toutes les infos de la BDD des chansons.
	// On peut ainsi visualiser la pochette et obtenir le fichier midi
	// Si l'utilisateur est authetifié, ses chansons apparaissent aussi.
	AfficherLoop(){
		
		ArrayList<Loop> daoLoop = null;
		try {
			System.out.println("\t\t\t LISTE DES LOOPS DE BASE");
			daoLoop = DAOFactory.getDAOLoop().readAll();
			System.out.println(daoLoop.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Creation> daoCreation = null;
		try {
			System.out.println("\t\t\t LISTE DES LOOPS CREES");
			User user = null;
			daoCreation = DAOFactory.getDAOCreation().readAll(user);
			System.out.println(daoCreation.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
		
	}
	
}
