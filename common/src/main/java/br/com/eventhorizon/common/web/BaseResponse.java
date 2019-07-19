package br.com.eventhorizon.common.web;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse implements Response {

  @JsonProperty("status")
  private ResponseStatus status;

  @JsonProperty("data")
  private Object data;

  @JsonProperty("error")
  private ResponseError error;

  public BaseResponse(ResponseStatus status) {
    this.status = status;
  }

  public BaseResponse(ResponseStatus status, Object data) {
    this(status);
    this.data = data;
  }

  public BaseResponse(ResponseStatus status,
      ResponseError error) {
    this(status);
    this.error = error;
  }

  public ResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ResponseStatus status) {
    this.status = status;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public ResponseError getError() {
    return error;
  }

  public void setError(ResponseError error) {
    this.error = error;
  }

}
