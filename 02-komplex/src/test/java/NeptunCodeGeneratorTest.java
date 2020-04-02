import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest {

	@Test
	void test() {
		NeptunCodeGenerator ncg = new NeptunCodeGenerator();
	
		assertEquals(ncg.getNextCounter(), 0);
		assertEquals(ncg.getNextCounter(), 1);
	}

}
