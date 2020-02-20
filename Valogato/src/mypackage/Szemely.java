package mypackage;

public class Szemely {
	private String nev;
	private int eletkor;
	
	public Szemely(String nev, int eletkor) {
		super();
		this.nev = nev;
		this.eletkor = eletkor;
	}

	public String getNev() {
		return nev;
	}

	public int getEletkor() {
		return eletkor;
	}

	@Override
	public String toString() {
		return "Személy: neve =" + nev + ", életkora=" + eletkor ;
	}
	
	
	
}
