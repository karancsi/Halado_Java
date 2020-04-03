import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;

class UserServiceImplTest {

	UserModify um= mock(UserModify.class);
	Validator va = mock (Validator.class);
	List<Validator> vlist;
	User u = mock(User.class);
	UserServiceImpl usimpl = new UserServiceImpl(um, vlist);
	
	@Test
	void testSave() {
		//usimpl.save(u);
		
		//verify(usimpl, times(1)).save(u);
		
	}


}
