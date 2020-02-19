package mypackage;

public class Tanulo {
	private final String nev;
	private int penz;
	private static int tanulok;
	public int getosszestanulo() {
		return tanulok;
	}

	public int getPenz() {
		return penz;
	}
	
	public String getName() {
		return nev;
	}

	public Tanulo(String nev, int penz) {
		super();
		this.nev = nev;
		this.penz = penz;
		tanulok ++;
	}
	
	public Tanulo(String nev)
	{
		this(nev, 10000);
	}

	@Override
	public String toString() {
		return "Tanulo: " + nev  + penz + " Ft";
	}
	
	public boolean Fogyasztas(int penz) {
		this.penz -= penz;
		if (this.penz <= 0) {
			return true;
		}
		else
			return false;
	}
	
	

	
}

