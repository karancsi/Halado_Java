package main.java;

public class SpaceValidator implements Validator {
    @Override
    public boolean isValid(User user) {
        return user.getName().indexOf(" ") == -1;
    }
}
