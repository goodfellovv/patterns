package request;

public class HttpRequest {

    public enum Method {
        GET,
        POST,
        PUT,
        DELETE
    }

    private boolean isAuthenticated;
    private String role;
    private Method method;

    public HttpRequest(boolean isAuthenticated, String role, Method method) {
        this.isAuthenticated = isAuthenticated;
        this.role = role;
        this.method = method;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getRole() {
        return role;
    }

    public Method getMethod() {
        return method;
    }
}
