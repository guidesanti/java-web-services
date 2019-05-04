package br.com.eventhorizon.springbootwebservice.controllers;

import br.com.eventhorizon.common.dao.BeerDao;
import br.com.eventhorizon.common.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/beers")
public class BeerController {

  private final BeerDao beerDao;

  @Autowired
  public BeerController(BeerDao beerDao) {
    this.beerDao = beerDao;
  }

  @GetMapping("/{id}")
  public Beer get(@PathVariable("id") String id) {
    return beerDao.get(id);
  }

  @GetMapping
  public Collection<Beer> get() {
    return beerDao.get(0);
  }

}
