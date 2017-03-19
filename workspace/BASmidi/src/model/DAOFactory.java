package model;


public class DAOFactory {

	public static daoLoop getDAOLoop() {
		// TODO Auto-generated method stub
		return new daoLoop();
	}
	
	public static daoUser getDAOUser() {
		// TODO Auto-generated method stub
		return new daoUser();
	}
	
	public static daoCreation getDAOCreation() {
		// TODO Auto-generated method stub
		return new daoCreation();
	}
	

}
