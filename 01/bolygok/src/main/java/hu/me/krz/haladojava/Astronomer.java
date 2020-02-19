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
		
		Random r = new Random();
		Planet[] bolygok = new Planet[10];
		
		for (int i = 0; i < 10; i++) {
			double radius = r.nextInt(1);
			Point pos = new Point(0, 0, 0);
			Point movepos = new Point(((i + 1) * 10), 0, 0);
			pos.Translate(movepos);
			bolygok[i] = new Planet(pos, radius, name);
			
		}
		
	}
	@Override
	public String toString() {
		
		return "Astronomer [discoveredPlanets=" +planets + ", name=" + name + "]";
	}
}
