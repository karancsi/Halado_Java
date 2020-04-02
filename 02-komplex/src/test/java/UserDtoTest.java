import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class UserDtoTest {

	@Test
	void testUserDto() {
		
		String uds= "valami";
		UserDto ud = new UserDto(uds);
		
		assertEquals(ud.getName(),"valami");
		
	}

	@Test
	void testGetName() {
		UserDto u = mock(UserDto.class);
		when(u.getName()).thenReturn("asd");
		assertEquals(u.getName(), "asd");
	}

	@Test
	void testSetName() {
		UserDto u = new UserDto("maki");
		String v = "zsiráf";
		u.setName(v);
		assertEquals(u.getName(), "zsiráf");
	}

}
