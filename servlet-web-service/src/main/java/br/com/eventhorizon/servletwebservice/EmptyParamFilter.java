package br.com.eventhorizon.servletwebservice;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns = "/beers")
public class EmptyParamFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    String inputString = servletRequest.getParameter("input");

    if (inputString != null && inputString.matches("[A-Za-z0-9]+")) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      servletResponse.getWriter().println("Missing input parameter");
    }
  }

  @Override
  public void destroy() {
  }

}
