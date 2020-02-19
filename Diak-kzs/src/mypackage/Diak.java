package mypackage;

public class Diak extends Szemely implements Comparable {

	private int puska;
	


	public Diak(String name, int age, int puska) {
		super(name, age);
		this.puska = puska;
	}

	@Override
	public String toString() {
		return "Diak : Név:" + getName() + " Életkor:" + getAge()  + " Puska:" +puska ;
	}



	@Override
	public int compareTo(Object o) {
		Diak d = (Diak)o;
		if (this.puska < d.puska) {
			return 1;
		}
		return 0;
	}
	
	
	

}
