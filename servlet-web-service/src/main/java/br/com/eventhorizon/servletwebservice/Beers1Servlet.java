package br.com.eventhorizon.servletwebservice;

import br.com.eventhorizon.common.model.Beer;
import br.com.eventhorizon.common.web.http.HttpStatus;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Beers1Servlet extends HttpServlet {

  private static long counter = 0;

  private long id;

  public Beers1Servlet() {
    this.id = counter++;
  }

  @Override
  public void init(ServletConfig var1) throws ServletException {
    System.out.println("Beers1Servlet.init(): ID = " + id);
  }

  @Override
  public void destroy() {
    System.out.println("Beers1Servlet.destroy(): ID = " + id);
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    System.out.println("Beers1Servlet.doGet(): ID = " + id);

    Beer beer = new Beer("id", "Beer Name", "Tripel");

    response.setStatus(HttpStatus.OK.getValue());
    response.setHeader("Content-Type", "application/json; charset=UTF-8");
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.writeValue(response.getWriter(), beer);
  }

}
