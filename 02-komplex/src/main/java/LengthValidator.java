package main.java;

public class LengthValidator implements Validator {
    @Override
    public boolean isValid(User user) {
        return user.getName().length() > 6;
    }
}
