import java.util.ArrayList;
import java.util.List;

import controllers.UserController;
import data.User;
import repositories.UserRepository;
import validators.LengthValidator;
import validators.SpaceValidator;
import validators.Validator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//L�trehoz egy repositoryt, egy �j felhaszn�l� list�t.
		UserRepository repository = new UserRepository();
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(new SpaceValidator());
		validators.add(new LengthValidator());
		System.out.println("Valid felhaszn�l� meg�llap�t�s�nak felt�telei");
		UserController controller = new UserController();
		System.out.println("Megn�zz�k a k�vetkez� 3 p�ld�ban ezek megfelelnek-e");
		repository.save(new User("Lacoka", "fgk54e", true));
		repository.save(new User("Bazsika", "GoZ532", true));
		repository.save(new User("Lacika", "Gdsee6", true));
		for (User user : repository.findAll()) {
			System.out.println(user.getName());
		}
		System.out.println("Adatok:" + repository.findAll());
	}
	

}
