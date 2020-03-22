package mypac;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import data.User;
import repositories.UserRepository;
import validators.LengthValidator;
import validators.SpaceValidator;
import validators.Validator;

public class App {


	public static void main(String[] args) {
		Logger log = Logger.getLogger(App.class.toString());
		//L�trehoz egy repositoryt, egy �j felhaszn�l� list�t.
		UserRepository repository = new UserRepository();
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(new SpaceValidator());
		validators.add(new LengthValidator());
		 log.info("Valid felhaszn�l� meg�llap�t�s�nak felt�telei");
		 log.info("Megn�zz�k a k�vetkez� 3 p�ld�ban ezek megfelelnek-e");
		
		repository.save(new User("Lacoka", "fgk54e", true));
		repository.save(new User("Bazsika", "GoZ532", true));
		repository.save(new User("Lacika", "Gdsee6", true));
		for (User user : repository.findAll()) {
			log.info("Adatok:" +user.getName());
		}
	}
	

}
