import java.util.Scanner;

import model.DAOFactory;
import model.daoLoop;
import object.Loop;

public class ChoisirLoop {
	// Cette fonction lance la loop sélectionnée en boucle infinie.
	
	
	Scanner scan = new Scanner(System.in);
	public Loop daoLoop = null;
	
	public  ChoisirLoop(){
		System.out.println("Entrer le numéro de la loop");
		
		try {
			int choixLoop = scan.nextInt();
			daoLoop = DAOFactory.getDAOLoop().read(choixLoop);
			System.out.println(daoLoop.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
