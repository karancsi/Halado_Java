package mypackage;

public class Tanar extends Szemely implements Valogato{

	private double jegy�tlag;
	public Tanar(String nev, int eletkor, double jegy�) {
		super(nev, eletkor);
		this.jegy�tlag = jegy�;
	}

	@Override
	public boolean joAlanyE() {
		if (this.getEletkor() <30 ) {
			if (this.jegy�tlag > 4) {
				return true;
			}
			else return false;
		}
		else
		return false;
	}

	@Override
	public String toString() {
		return "Tan�r neve" + getNev() +  ", jegy�tlaga " + jegy�tlag ;
	}

	
}
