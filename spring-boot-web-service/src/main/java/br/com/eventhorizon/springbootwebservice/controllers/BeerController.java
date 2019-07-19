package br.com.eventhorizon.springbootwebservice.controllers;

import br.com.eventhorizon.common.web.BaseResponse;
import br.com.eventhorizon.common.web.Response;
import br.com.eventhorizon.common.dao.BeerDao;
import br.com.eventhorizon.common.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beers")
public class BeerController {

  private final BeerDao beerDao;

  @Autowired
  public BeerController(BeerDao beerDao) {
    this.beerDao = beerDao;
  }

  @GetMapping("/{id}")
  public Response get(@PathVariable("id") String id) {
    Response response = new BaseResponse(br.com.eventhorizon.common.web.ResponseStatus.SUCCESS);
    ((BaseResponse) response).setData(beerDao.get(id));
    return response;
  }

  @GetMapping
  public Response get(@RequestParam(value = "limit", required = false, defaultValue = "50") long limit) {
    Response response = new BaseResponse(br.com.eventhorizon.common.web.ResponseStatus.SUCCESS);
    ((BaseResponse) response).setData(beerDao.get(limit));
    return response;
  }

  @PostMapping
  public Beer create(@RequestBody Beer beer) {
    return beerDao.create(beer);
  }

  @PutMapping("/{id}")
  public Beer update(@PathVariable("id") String id, @RequestBody Beer beer) {
    return beerDao.update(id, beer);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(value = HttpStatus.NO_CONTENT)
  public void delete(@PathVariable("id") String id) {
    beerDao.delete(id);
  }

}
