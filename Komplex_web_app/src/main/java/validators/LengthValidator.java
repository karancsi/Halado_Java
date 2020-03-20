package validators;

import data.User;

public class LengthValidator implements Validator {

	public boolean isValid(User user) {

		return user.getName().length() > 5;
	}

}
