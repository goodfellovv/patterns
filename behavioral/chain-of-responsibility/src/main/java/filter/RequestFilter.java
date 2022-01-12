package filter;

import request.HttpRequest;

import java.util.List;

public class RequestFilter extends BaseFilter {
    private final List<HttpRequest.Method> methods;

    public RequestFilter(List<HttpRequest.Method> methods) {
        this.methods = methods;
    }

    @Override
    public void doFilter(HttpRequest request) throws IllegalArgumentException {
        if(!methods.contains(request.getMethod())){
            System.out.println(getClass().getName() + " : " + "Request method is not accepted");
            throw new IllegalArgumentException("Incorrect request");
        } else {
            System.out.println(getClass().getName() + " : " + "Request method accepted");
        }
    }
}
