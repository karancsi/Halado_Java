package main.java;

public class UserController {
    UserService userService;
    NeptunCodeGenerator neptunCodeGenerator;

    public UserController(UserService userService, NeptunCodeGenerator neptunCodeGenerator) {
        this.userService = userService;
        this.neptunCodeGenerator = neptunCodeGenerator;
    }

    public void save(UserDto userDto) {
        userService.save(new User(userDto.getName(), true,
                String.format("neptun %d", neptunCodeGenerator.getNextCounter())));
    }
}
