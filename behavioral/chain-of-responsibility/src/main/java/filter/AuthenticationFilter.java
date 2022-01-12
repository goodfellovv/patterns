package filter;

import request.HttpRequest;

public class AuthenticationFilter extends BaseFilter {
    @Override
    public void doFilter(HttpRequest request) throws IllegalArgumentException {
        if (request.isAuthenticated()) {
            System.out.println(getClass().getName() + " : " + "Authenticated request");
        } else {
            System.out.println(getClass().getName() + " : " + "Not authenticated request");
            throw new IllegalArgumentException("Not authenticated request");
        }
    }
}
