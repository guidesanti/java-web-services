package br.com.eventhorizon.springwebmvcwebservice.services;

import br.com.eventhorizon.common.model.Beer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeersService {

  private List<Beer> beers = new ArrayList<>();

  public List<Beer> findBeers() {
    return beers;
  }

  public Beer findById(Long id) {
    return new Beer("beerId", "beerName", "beerStyle");
  }

}
