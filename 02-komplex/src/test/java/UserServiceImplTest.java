import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class UserServiceImplTest {

	UserModify um= mock(UserModify.class);
	Validator va = mock (Validator.class);
	List<Validator> vlist = new ArrayList<>();
	User u = mock(User.class);
	
	@Test
	void testSave() {
		SpaceValidator spaceValidator = mock(SpaceValidator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        vlist.add(spaceValidator);
        vlist.add(lengthValidator);
        User user = mock(User.class);
        UserServiceImpl usimpl = new UserServiceImpl(um, vlist);
    	
        um.save(user);
        usimpl.save(user);
        verify(um, times(1)).save(user);
		
	}


}
