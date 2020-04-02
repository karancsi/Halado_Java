//package main.java;


import java.util.ArrayList;
import java.util.List;


public class Komplex {
    public static void main(String[] args) {

        UseRepository useRepository = new UseRepository();
        List<Validator> validators = new ArrayList<>();
        validators.add(new LengthValidator());
        validators.add(new SpaceValidator());
        UserService userService = new UserServiceImpl(useRepository, validators);
        UserController userController = new UserController(
                userService, new NeptunCodeGenerator()
        );


        userController.save(new UserDto(" vanBenneSpace"));
        userController.save(new UserDto("rovid"));
        userController.save(new UserDto("nagyonjo"));
    }
}
