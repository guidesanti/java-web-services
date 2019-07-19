package br.com.eventhorizon.common.web.http;

public enum HttpStatus {

  // Information responses
  CONTINUE("CONTINUE", 100),
  SWITCHING_PROTOCOL("SWITCHING_PROTOCOL", 101),
  PROCESSING("PROCESSING", 102),
  EARLY_HINTS("EARLY_HINTS", 103),

  // Successfull responses
  OK("OK", 200);

  private String name;

  private Integer value;

  HttpStatus(String name, Integer value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public Integer getValue() {
    return value;
  }

}
