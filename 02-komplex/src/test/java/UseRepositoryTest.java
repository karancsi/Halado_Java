import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;

class UseRepositoryTest {
	
	UseRepository ur = new UseRepository();
	
	@Test
	public void saveTest() {
		User u = mock(User.class);
		
		when(u.getName()).thenReturn("Balu");
		
		ur.save(u);
		
		assertEquals(ur.findAll().get(0), u);
		assertEquals(ur.findAll().size(), 1);	
	}
	
	@Test
	public void getByNeptunkodTest(){
		User u = mock(User.class);
		when(u.getNeptunkod()).thenReturn("SM2EMO");
		
		ur.save(u);
		assertEquals(ur.getByNektunKod("SM2EMO"), u);
		assertEquals(ur.getByNektunKod(""),null);
	}

	
	@Test
	public void findByEnabledIsTrueTest() {
		User u = mock(User.class);
		User u1 = mock(User.class);
		when(u.isEnabled()).thenReturn(true);
		when(u1.isEnabled()).thenReturn(false);
		ur.save(u);
		ur.save(u1);
		assertEquals(ur.findByEnabledIsTrue().get(0),u);
		assertEquals(ur.findByEnabledIsTrue().size(), 1);
		
		
		
	}
	
}
