package mypackage;

public class Tanar extends Szemely implements Valogato{

	private double jegyátlag;
	public Tanar(String nev, int eletkor, double jegyá) {
		super(nev, eletkor);
		this.jegyátlag = jegyá;
	}

	@Override
	public boolean joAlanyE() {
		if (this.getEletkor() <30 ) {
			if (this.jegyátlag > 4) {
				return true;
			}
			else return false;
		}
		else
		return false;
	}

	@Override
	public String toString() {
		return "Tanár neve" + getNev() +  ", jegyátlaga " + jegyátlag ;
	}

	
}
