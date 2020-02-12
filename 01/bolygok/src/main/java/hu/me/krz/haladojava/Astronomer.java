package hu.me.krz.haladojava;

import java.util.List;
import hu.me.krz.haladojava.*;
import java.util.Random;


public class Astronomer {
	private String name;
	private List<Planet> planets;

	public Astronomer(String name, List<Planet> planets) {
		super();
		this.name = name;
		this.planets = planets;
	}

	public List<Planet> getDiscoveredPlanets() {
		return planets;
	}
	
	public void observeTheSky(){
		List<Planet> lista;
		Planet p;
		Point movepos;
		Point pos;
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			r = r.nextInt(1);
			movepos.x += 10; 
			pos = Translate(pos, movepos);
			p = new Planet();
			lista.add(p);
		}
	}
}
