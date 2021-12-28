package user;

import java.util.HashMap;
import java.util.Map;

public class UserContext {
    private final Map<String, User> userContext = new HashMap<>();

    public User getUser(String name){
        return userContext.computeIfAbsent(name, newUser -> new User(name));
    }

}
