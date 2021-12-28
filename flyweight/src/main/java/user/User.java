package user;

public class User {
    private String name;
    boolean loggedIn = false;

    public User(String name) {
        System.out.println("User [" + name + "] created");
        this.name = name;
    }

    public void login(){
        if(loggedIn){
            System.out.println("User [" + name + "] already logged in");
        } else {
            loggedIn = true;
            System.out.println("User [" + name + "] logged in");
        }
    }

    public void logout(){
        if(!loggedIn){
            System.out.println("User [" + name + "] already logged out");
        } else {
            loggedIn = false;
            System.out.println("User [" + name + "] logged out");
        }
    }
}
