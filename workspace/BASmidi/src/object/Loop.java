package object;

public class Loop {
	
	private int idLoop;
	private String Loop_name;
	private String Loop_cover;
	
	
	public Loop(int idLoop, String loop_name, String loop_cover) {
		super();
		this.idLoop = idLoop;
		Loop_name = loop_name;
		Loop_cover = loop_cover;
	}


	public int getIdLoop() {
		return idLoop;
	}


	public String getLoop_name() {
		return Loop_name;
	}


	public String getLoop_cover() {
		return Loop_cover;
	}


	public void setIdLoop(int idLoop) {
		this.idLoop = idLoop;
	}


	public void setLoop_name(String loop_name) {
		Loop_name = loop_name;
	}


	public void setLoop_cover(String loop_cover) {
		Loop_cover = loop_cover;
	}


	@Override
	public String toString() {
		return idLoop + "\t" + Loop_name +"\t\t\t" + Loop_cover +"\r\n";
	}
	
	

}
