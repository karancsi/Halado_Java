package mypackage;

public class Diak extends Szemely implements Valogato {

	private int puskadb;
	
	public Diak(String nev, int eletkor) {
		super(nev, eletkor);
	}
	
	public Diak(String nev, int eletkor, int puskadb) {
		super(nev,eletkor);
		this.puskadb = puskadb;
	}

	@Override
	public boolean joAlanyE() {
		if (this.puskadb == 0) {
			return true;
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Diák: neve " + getNev() + "életkora " + getEletkor() + "puskék száma " + puskadb ;
	}

	
}
