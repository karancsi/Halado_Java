import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest {

	@Test
	void test() {
		NeptunCodeGenerator ncg = new NeptunCodeGenerator();
	
		int valami = ncg.getNextCounter();
		int valami2 = ncg.getNextCounter();
		assertEquals(valami,1);
		assertEquals(valami2,2);
	}

}
