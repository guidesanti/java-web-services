package br.com.eventhorizon.springwebmvcwebservice.controllers;

import br.com.eventhorizon.common.web.BaseResponse;
import br.com.eventhorizon.common.web.Response;
import br.com.eventhorizon.common.web.ResponseStatus;
import br.com.eventhorizon.springwebmvcwebservice.services.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/beers")
public class BeersController {

  private BeersService beersService;

  @Autowired
  public BeersController(BeersService beersService) {
    this.beersService = beersService;
  }

  @GetMapping
  public Response getBeers() {
    return new BaseResponse(ResponseStatus.SUCCESS, beersService.findBeers());
  }

  @GetMapping("/{id}")
  public Response getBeer(@PathVariable Long id) {
    return new BaseResponse(ResponseStatus.SUCCESS, beersService.findById(id));
  }

  @GetMapping("/test1/{id}")
  public Response getTest1(@PathVariable Long id) {
    return new BaseResponse(ResponseStatus.SUCCESS, beersService.findById(id));
  }

  @GetMapping("/test2/{id}")
  public Response getTest2(HttpServletResponse response, @PathVariable Long id) {
    response.addHeader("x-my-custom-header", "x-my-custom-header-value");
    return new BaseResponse(ResponseStatus.SUCCESS, beersService.findById(id));
  }

  @GetMapping("/test3/{id}")
  public ResponseEntity<BaseResponse> getTest3(@PathVariable Long id) {
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set("x-my-custom-header", "x-my-custom-header-value");

    return ResponseEntity.ok()
        .headers(responseHeaders)
        .body(new BaseResponse(ResponseStatus.SUCCESS, beersService.findById(id)));
  }

}
