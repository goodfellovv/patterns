package auth;

public class GoogleAuthenticator extends Authenticator {

    public GoogleAuthenticator(String url) {
        super.authServerUrl = url;
    }

    @Override
    void validateCredentials(String username, String password) {
        if(!username.endsWith("@google.com") || password.length() < 8){
            throw new IllegalArgumentException("Username or password for " +
                    "Google Authentication is incorrect");
        } else {
            System.out.println("Yandex credentials are valid");
        }
    }

    @Override
    void sendData(String url, String username, String password) {
        System.out.println("Send authentication request to " + super.authServerUrl);
    }
}
