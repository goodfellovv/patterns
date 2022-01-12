package filter;

import request.HttpRequest;

public abstract class BaseFilter {
    private BaseFilter nextFilter;

    public void setNextFilter(BaseFilter filter) {
        this.nextFilter = filter;
    }

    public void filterRequest(HttpRequest request) throws Exception {
        doFilter(request);
        if(nextFilter != null){
            nextFilter.filterRequest(request);
        }
    }

    protected abstract void doFilter(HttpRequest request) throws Exception;
}
