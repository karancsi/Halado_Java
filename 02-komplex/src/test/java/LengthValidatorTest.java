import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class LengthValidatorTest {
	
	LengthValidator lv = new LengthValidator();

	@Test
	void isUserNameIsLongEnough() {
		//mock
		User u = mock(User.class);
		//when
		when(u.getName()).thenReturn("Balukakakak");
		//assert
		assertTrue(lv.isValid(u));
		
	}
	
	@Test
	void isUserNameIsTooShort() {
		//mock
		User u = mock(User.class);
		//when
		when(u.getName()).thenReturn("Balu");
		//assert
		assertFalse(lv.isValid(u));
	}

}
