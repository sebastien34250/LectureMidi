package object;

public class User {

	private int idUser;
	private String user_name;
	private String user_email;
	
	public User(int idUser, String user_name, String user_email) {
		super();
		this.idUser = idUser;
		this.user_name = user_name;
		this.user_email = user_email;
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
