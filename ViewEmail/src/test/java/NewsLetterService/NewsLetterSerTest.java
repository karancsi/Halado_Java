package NewsLetterService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import NewsLetterEmail.Dto.EmailDto;
import NewsLetterRepository.NewsLetterRepo;

class NewsLetterSerTest {

	@InjectMocks
	NewsLetterSer service;

	@Mock
	NewsLetterRepo repository;

	Date date = new Date();
	int index = 0;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testInit() {

	}

	@Test
	public void testAdd() {
		init();
		EmailDto emailDto = new EmailDto("tárgy", "message", date);

		service.add(emailDto);

		verify(repository, times(1)).add(emailDto);

	}

	@Test
	public void testSave() {
		init();
		EmailDto updatedemaildto = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		UUID uuid = updatedemaildto.getId();
		updatedemaildto.setEmailMessage("A káromkodás rossz!");
		when(repository.getById(uuid)).thenReturn(updatedemaildto);

		service.save(updatedemaildto, uuid);
		assertEquals(repository.getById(uuid).getEmailMessage(), updatedemaildto.getEmailMessage());

	}

	@Test
	public void testDelete() {
		init();
		EmailDto emaildto = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		UUID uuid = emaildto.getId();
		service.delete(uuid);
		assertEquals(null, repository.getById(uuid));

	}

	@Test
	public void testGetById() {
		init();
		EmailDto emaildto = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		UUID uuid = emaildto.getId();

		when(repository.getById(uuid)).thenReturn(emaildto);

		assertEquals(emaildto, repository.getById(uuid));

	}

	@Test
	public void testGetAllNewsLetter() {
		init();

		List<EmailDto> list = new ArrayList<EmailDto>();
		EmailDto emailDto = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		list.add(emailDto);

		when(repository.getAllNewsLetter()).thenReturn(list);

		List<EmailDto> testlist = service.getAllNewsLetter();
		assertEquals(1, testlist.size());
		verify(repository, times(1)).getAllNewsLetter();
	}
	
	@Test
	public void testSort() {
		init();
		List<EmailDto> list = new ArrayList<EmailDto>();
		Date date2 = new Date(2020-01-05);
		EmailDto emailDto = new EmailDto("Aktualitások a ME életéről", "COVID_19", date2);
		list.add(emailDto);
		
		EmailDto emailDto2 = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		list.add(emailDto2);

		service.sort();
		
		assertEquals(0, list.indexOf(emailDto));
	}
	
	@Test
	public void testReverseSort() {
		init();
		List<EmailDto> list = new ArrayList<EmailDto>();
		
		EmailDto emailDtoFirst = new EmailDto("Aktualitások a ME életéről", "COVID_19", date);
		list.add(emailDtoFirst);
		
		Date date2 = new Date(2020-01-05);
		EmailDto emailDtoSecond = new EmailDto("Aktualitások a ME életéről", "COVID_19", date2);
		list.add(emailDtoSecond);
		

		service.reverseSort();
		
		assertEquals(1, list.indexOf(emailDtoSecond));
	}
	
	@Test
	public void testSearch() {
		init();
		repository.init();

		//amikor nincs találat
		List<EmailDto> searchList = new ArrayList<>();
		searchList = service.searchByContent("__");
		when(repository.searchByContent("__")).thenReturn(searchList);
		verify(repository, times(1)).searchByContent("__");
		
		//amikor van találat - több is 
		searchList = service.searchByContent("a");
		when(repository.searchByContent("a")).thenReturn(searchList);
		verify(repository, times(1)).searchByContent("a");
	}

}
