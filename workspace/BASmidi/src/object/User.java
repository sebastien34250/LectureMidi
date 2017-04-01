package object;

public class User {

	private int idUser;
	private String user_name;
	private String user_email;
	private String user_mdp;
	
	public User(int idUser, String user_name, String user_email, String user_mdp) {
		super();
		this.idUser = idUser;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mdp = user_mdp;
	}

	public String getUser_mdp() {
		return user_mdp;
	}

	public void setUser_mdp(String user_mdp) {
		this.user_mdp = user_mdp;
	}

	public int getIdUser() {
		return idUser;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", user_name=" + user_name + ", user_email=" + user_email + "]";
	}

}
