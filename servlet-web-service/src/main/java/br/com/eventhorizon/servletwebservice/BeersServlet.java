package br.com.eventhorizon.servletwebservice;

import br.com.eventhorizon.common.model.Beer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/beers", name = "beersServlet")
public class BeersServlet extends HttpServlet {

  private static long counter = 0;

  private long id;

  public BeersServlet() {
    this.id = counter++;
  }

  @Override
  public void init(ServletConfig var1) throws ServletException {
    System.out.println("BeerServlet.init(): ID = " + id);
  }

  @Override
  public void destroy() {
    System.out.println("BeerServlet.destroy(): ID = " + id);
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    System.out.println("BeerServlet.doGet(): ID = " + id);

    response.setStatus(200);
    Beer beer = new Beer("id", "Beer Name", "Tripel");
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.writeValue(response.getWriter(), beer);
  }

}
