import java.util.Scanner;

import model.DAOFactory;
import model.daoUser;
import object.User;

public class CréerEspaceClient {
	
	Scanner sc = new Scanner(System.in);
	
	public CréerEspaceClient() {
		
		System.out.println("Choisir un identifiant");
		String identifiant = sc.nextLine();
		
		System.out.println("Entrer une adresse mail");
		String mail = sc.nextLine();
		
		System.out.println("Entrer mot de passe");
		String mdp = sc.nextLine();
		
		User client = new User (30, identifiant, mail, mdp);
		
		try {
			DAOFactory.getDAOUser().create(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
