package main.java;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserModify userModify;
    List<Validator> validators;

    public UserServiceImpl(UserModify userModify, List<Validator> validators) {
        this.userModify = userModify;
        this.validators = validators;
    }

    @Override
    public void save(User user) {
        if (isValid(user)) {
            userModify.save(user);
        }
    }

    private boolean isValid(User user) {
        for (Validator validator : validators) {
            if (!validator.isValid(user)) {
                return false;
            }
        }
        return true;
    }
}
