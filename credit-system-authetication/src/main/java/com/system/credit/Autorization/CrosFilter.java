package com.system.credit.Autorization;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CrosFilter implements Filter
{
    private static final HashMap<String,String> origins=new HashMap<>();
    static {

        origins.put("http://localhost:4200","http://localhost:4200");
        origins.put("http://localhost:8080","http://localhost:8080");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;

        String origin=request.getHeader(HttpHeaders.ORIGIN);
        System.out.println("request origin "+origin);

        response.setHeader("Access-Control-Allow-Origin",origin);
        response.setHeader("Access-Control-Allow-Credentials","true");


        if (origins.get(origin)!=null&&"OPTIONS".equals(request.getMethod())&&origin.equals(origin)){

            response.setHeader("Access-Control-Allow-Methods","POST,GET,DELETE,PUT,OPTIONS");
            response.setHeader("Access-Control-Allow-Headers","Authorization,Content-Type,Accept");
            response.setHeader("Access-Control-Max-Age","3600");
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            chain.doFilter(req,resp);
        }



    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
