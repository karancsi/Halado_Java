package controllers;


import data.User;
import repositories.UserRepository;

public class UserController {
	
	public void save(User user) {
			UserRepository r = new UserRepository();
			r.save(user);
			r.findAll();
	}
	
	
	
}
