import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserControllerTest {

	/*@Test
	public void UserControllerConstructorTest() {
		UserService userService = mock(UserService.class);
	    NeptunCodeGenerator neptunCodeGenerator = new NeptunCodeGenerator();
	    
	    UserController uc = new UserController(userService, neptunCodeGenerator);
	    
	}*/
	
	@Test
	void UserControllerSaveTest() {
		UserController uct = mock(UserController.class);
		
		UserDto udto = new UserDto("asdfg");
		//User user = new User("Asdasdasd", true, "ABC123");
		doNothing().when(uct).save(udto);
		verify(uct, times(1));
		
	}

}
