import auth.Authenticator;
import auth.GoogleAuthenticator;
import auth.YandexAuthenticator;

public class Main {
    //*************** Args *****************
    //Yandex: yandex admin@yandex.ru 123456
    //Google: google admin@google.com 12345678

    public static void main(String[] args) {
        System.out.println("********Authenticating.....********");
        Authenticator authenticator;
        if (args[0].equals("google")) {
            authenticator = new GoogleAuthenticator("http://google.com/auth");
        } else if (args[0].equals("yandex")) {
            authenticator = new YandexAuthenticator("http://yandex.ru/auth");
        } else {
            throw new IllegalArgumentException("Auth provide is incorrect " + args[0]);
        }
        authenticator.authenticate(args[1], args[2]);
        System.out.println("********User authenticated********");
    }
}
