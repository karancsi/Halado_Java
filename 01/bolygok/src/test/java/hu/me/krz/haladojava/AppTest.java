package hu.me.krz.haladojava;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.hamcrest.MatcherAssert.asserThat;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	Point po= new Point(20,12,23);
    	Planet p = new Planet(po, 3.2, "Jani");
        assertEquals("Jani", p.getName());
    }
}
