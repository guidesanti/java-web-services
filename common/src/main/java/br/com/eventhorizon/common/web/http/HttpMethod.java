package br.com.eventhorizon.common.web.http;

public enum HttpMethod {

  GET(HttpMethod.GET_NAME),
  HEAD(HttpMethod.HEAD_NAME),
  POST(HttpMethod.POST_NAME),
  PUT(HttpMethod.PUT_NAME),
  DELETE(HttpMethod.DELETE_NAME),
  CONNECT(HttpMethod.CONNECT_NAME),
  OPTIONS(HttpMethod.OPTIONS_NAME),
  TRACE(HttpMethod.TRACE_NAME),
  PATCH(HttpMethod.PATCH_NAME);

  public static final String GET_NAME = "GET";

  public static final String HEAD_NAME = "HEAD";

  public static final String POST_NAME = "POST";

  public static final String PUT_NAME = "PUT";

  public static final String DELETE_NAME = "DELETE";

  public static final String CONNECT_NAME = "CONNECT";

  public static final String OPTIONS_NAME = "OPTIONS";

  public static final String TRACE_NAME = "TRACE";

  public static final String PATCH_NAME = "PATCH";

  private String name;

  HttpMethod(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public HttpMethod fromName(String name) throws Exception {
    switch (name) {
      case HttpMethod.GET_NAME:
        return GET;
      case HttpMethod.HEAD_NAME:
        return HEAD;
      case HttpMethod.POST_NAME:
        return POST;
      case HttpMethod.PUT_NAME:
        return PUT;
      case HttpMethod.DELETE_NAME:
        return DELETE;
      case HttpMethod.CONNECT_NAME:
        return CONNECT;
      case HttpMethod.OPTIONS_NAME:
        return OPTIONS;
      case HttpMethod.TRACE_NAME:
        return HttpMethod.TRACE;
      case HttpMethod.PATCH_NAME:
        return HttpMethod.PATCH;
      default:
        throw new Exception("Invalid HTTP method name");
    }
  }

}
