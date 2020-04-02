import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;

class UserServiceImplTest {

	@Test
	void testUserServiceImpl() {
	/*	UseRepository urt = mock(UseRepository.class);
		User u = new User("asdf", true, "sdfgh");
		doNothing().when(urt).save(u);
		verify(urt, times(1));*/
	}

	@Test
	void testSave() {
		UserModify userModify = null;
	    List<Validator> validators = null;
		UserServiceImpl usi = new UserServiceImpl(userModify, validators);
		User u = mock(User.class);
		usi.save(u);
		
		
	}

}
