import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class UserTest {
	
	@Test
	public void UserConstructorTest(){	
		
	     String nameTest = "Zsófi";
	     boolean enabledTest = true;
	     String neptunkodTest = "KF4DF5";
	     
	     User user = new User(nameTest, enabledTest, neptunkodTest);
	     
	     assertEquals(user.getName(), nameTest);
	     
	     assertEquals(user.getNeptunkod(), neptunkodTest);
	     
	     assertEquals(user.isEnabled(), enabledTest);	
	}
	
	

	@Test
	void testGetName() {
		User u = mock(User.class);
		when(u.getName()).thenReturn("Laci");
		assertEquals(u.getName(), "Laci");
	}

	@Test
	void testIsEnabled() {
		User u = mock(User.class);
		when(u.isEnabled()).thenReturn(true);
		assertEquals(u.isEnabled(), true);
	}

	@Test
	void testGetNeptunkod() {
		User u = mock(User.class);
		when(u.getNeptunkod()).thenReturn("sd4dfg3");
		assertEquals(u.getNeptunkod(), "sd4dfg3");
	}

}
