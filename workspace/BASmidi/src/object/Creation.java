package object;

public class Creation {

	private int idCreation;
	private String creation_name;
	private String creation_cover;
	
	public Creation(int idCreation, String creation_name, String creation_cover) {
		super();
		this.idCreation = idCreation;
		this.creation_name = creation_name;
		this.creation_cover = creation_cover;
	}

	public int getIdCreation() {
		return idCreation;
	}

	public String getCreation_name() {
		return creation_name;
	}

	public String getCreation_cover() {
		return creation_cover;
	}

	public void setIdCreation(int idCreation) {
		this.idCreation = idCreation;
	}

	public void setCreation_name(String creation_name) {
		this.creation_name = creation_name;
	}

	public void setCreation_cover(String creation_cover) {
		this.creation_cover = creation_cover;
	}

	@Override
	public String toString() {
		return "Creation [idCreation=" + idCreation + ", creation_name=" + creation_name + ", creation_cover="
				+ creation_cover + "]";
	}
	
	
	
}
