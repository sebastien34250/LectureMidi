package object;

public class Mix {

	private boolean kick, snare, hit, cymb, perc;

	public Mix(boolean kick, boolean snare, boolean hit, boolean cymb, boolean perc) {
		super();
		this.kick = kick;
		this.snare = snare;
		this.hit = hit;
		this.cymb = cymb;
		this.perc = perc;
	}

	public boolean isKick() {
		return kick;
	}

	public boolean isSnare() {
		return snare;
	}

	public boolean isHit() {
		return hit;
	}

	public boolean isCymb() {
		return cymb;
	}

	public boolean isPerc() {
		return perc;
	}

	public void setKick(boolean kick) {
		this.kick = kick;
	}

	public void setSnare(boolean snare) {
		this.snare = snare;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public void setCymb(boolean cymb) {
		this.cymb = cymb;
	}

	public void setPerc(boolean perc) {
		this.perc = perc;
	}
	
}
