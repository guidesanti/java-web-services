package br.com.eventhorizon.common.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseError {

  @JsonProperty("code")
  private Long code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("details")
  private String details;

  public ResponseError(Long code, String message) {
    this.code = code;
    this.message = message;
  }

  public ResponseError(Long code, String message, String details) {
    this(code, message);
    this.details = details;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

}
