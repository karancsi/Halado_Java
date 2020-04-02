import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SpaceValidatorTest {

	@Test
	void testWithoutSpace() {
		SpaceValidator sv = new SpaceValidator();
		User u = mock(User.class);
		when(u.getName()).thenReturn("Gréta");
		assertEquals(sv.isValid(u), true);
	}
	@Test
	void testWithSpace() {
		SpaceValidator sv = new SpaceValidator();
		User u = mock(User.class);
		when(u.getName()).thenReturn("Gré Ta");
		assertEquals(sv.isValid(u), false);
	}

}
