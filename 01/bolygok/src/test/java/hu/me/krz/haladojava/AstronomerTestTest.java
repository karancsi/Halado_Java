package hu.me.krz.haladojava;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AstronomerTestTest {

	
		@Test
		public void testAstronomer() {
			Point po= new Point(20,12,23);
	    	Planet pl = new Planet(po, 3.2, "Jani");
			List<Planet> p = new ArrayList<Planet>();
			p.add(pl);
			Astronomer as= new Astronomer("Zsolti", p);
			assertTrue(as.getDiscoveredPlanets().equals(p));
	

}
}
