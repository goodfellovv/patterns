package filter;

import request.HttpRequest;

import java.util.List;

public class PermissionFilter extends BaseFilter {
    private final List<String> roles;

    public PermissionFilter(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public void doFilter(HttpRequest request) throws IllegalArgumentException {
        if(!roles.contains(request.getRole())){
            System.out.println(getClass().getName() + " : " + "Request is not permitted");
            throw new IllegalArgumentException("Permission denied");
        } else {
            System.out.println(getClass().getName() + " : " + "Request is permitted");
        }
    }
}
