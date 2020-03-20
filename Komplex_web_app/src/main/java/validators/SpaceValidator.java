package validators;

import data.User;

public class SpaceValidator implements Validator{

	public boolean isValid(User user) {

		return !user.getName().contains(" ");
	}

}
