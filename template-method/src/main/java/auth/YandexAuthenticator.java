package auth;

public class YandexAuthenticator extends Authenticator {

    public YandexAuthenticator(String url) {
        super.authServerUrl = url;
    }

    @Override
    void validateCredentials(String username, String password) {
        if(!username.endsWith("@yandex.ru") || password.length() < 6){
            throw new IllegalArgumentException("Username or password for " +
                    "Yandex Authentication is incorrect");
        } else {
            System.out.println("Yandex credentials are valid");
        }
    }

    @Override
    void sendData(String url, String username, String password) {
        System.out.println("Send authentication request to " + super.authServerUrl);
    }
}
