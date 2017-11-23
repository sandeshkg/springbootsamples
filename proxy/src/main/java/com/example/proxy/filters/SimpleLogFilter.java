package com.example.proxy.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.io.Console;
import java.util.logging.Logger;

public class SimpleLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        org.apache.log4j.Logger.getLogger("SimpleLogFilter").error("Request Method :" + request.getMethod() + " Request URI:" + request.getRequestURI());
        //Console.
        //System.console().writer().println("My Fancy Filter" ); //request.getMethod() + " " + request.getPathInfo());

        return  null;

    }
}
