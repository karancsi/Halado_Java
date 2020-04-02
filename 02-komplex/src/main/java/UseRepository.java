package main.java;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UseRepository implements UserModify {
    Logger log = Logger.getLogger(Komplex.class.toString());
    private List<User> users = new ArrayList<>();
    public void save(User user) {
        log.info("%s mentve%n"+ user.getName());
        users.add(user);
    }
    public User getByNektunKod(String neptunkod) {
        for (User user : users) {
            if (user.getNeptunkod().equals(neptunkod)) {
                return user;
            }
        }
        return null;
    }
    public List<User> findAll() {
        return users;
    }
    public List<User> findByEnabledIsTrue() {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.isEnabled()) {
                result.add(user);
            }
        }
        return result;
    }
}
