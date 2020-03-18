package br.com.eventhorizon.springbootwebservice.controllers;

import br.com.eventhorizon.common.web.BaseResponse;
import br.com.eventhorizon.common.web.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController {

  @GetMapping
  public Response get() {
    Response response = new BaseResponse(br.com.eventhorizon.common.web.ResponseStatus.SUCCESS);
    ((BaseResponse) response).setData("SUCCESS");
    return response;
  }

}
