import filter.AuthenticationFilter;
import filter.BaseFilter;
import filter.PermissionFilter;
import filter.RequestFilter;
import request.HttpRequest;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HttpRequest> requests = Arrays.asList(
        new HttpRequest(true, "developer", HttpRequest.Method.GET),
        new HttpRequest(true, "developer", HttpRequest.Method.GET),
        new HttpRequest(false, "unknown", HttpRequest.Method.GET),
        new HttpRequest(true, "admin", HttpRequest.Method.PUT),
        new HttpRequest(true, "developer", HttpRequest.Method.PUT),
        new HttpRequest(false, "unknown", HttpRequest.Method.PUT),
        new HttpRequest(true, "admin", HttpRequest.Method.DELETE),
        new HttpRequest(true, "developer", HttpRequest.Method.GET),
        new HttpRequest(false, "unknown", HttpRequest.Method.GET),
        new HttpRequest(true, "admin", HttpRequest.Method.POST),
        new HttpRequest(true, "developer", HttpRequest.Method.POST),
        new HttpRequest(false, "unknown", HttpRequest.Method.GET)
        );

        BaseFilter requestFilter = new RequestFilter(Arrays.asList(HttpRequest.Method.GET, HttpRequest.Method.POST));
        BaseFilter authenticationFilter = new AuthenticationFilter();
        BaseFilter permissionFilter = new PermissionFilter(Arrays.asList("admin", "developer"));

        authenticationFilter.setNextFilter(permissionFilter);
        requestFilter.setNextFilter(authenticationFilter);

        for (int i = 1; i <= requests.size(); i++){
            try {
                System.out.println("******** Request № " + i + " ********");
                requestFilter.filterRequest(requests.get(i - 1));
                System.out.println("******** Request № " + i + " proceeded ******** \n");
            } catch (Exception e) {
                System.out.println("******** Request № " + i + " declined ******** \n");
            }
        }
    }
}
