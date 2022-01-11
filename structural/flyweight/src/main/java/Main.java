import user.User;
import user.UserContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserContext context = new UserContext();
        List<User> users = new ArrayList<>();

        System.out.println("Create users");
        users.add(context.getUser("Tom"));
        users.add(context.getUser("Rick"));
        users.add(context.getUser("Carl"));
        users.add(context.getUser("Tom"));
        users.add(context.getUser("Ann"));
        users.add(context.getUser("Carl"));
        users.add(context.getUser("Rick"));
        users.add(context.getUser("Rick"));
        users.add(context.getUser("Tom"));
        System.out.println();

        System.out.println("========Login users========");
        users.forEach(User::login);
        System.out.println();

        System.out.println("========Logout users========");
        users.forEach(User::logout);
    }
}
