package auth;

public abstract class Authenticator {

    protected String authServerUrl;

    public void authenticate(String username, String password){
        System.out.println("Authenticating " + username);
        validateCredentials(username, password);
        sendData(authServerUrl,username, password);
    }

    abstract void validateCredentials(String username, String password);

    abstract void sendData(String url, String username, String password);
}
