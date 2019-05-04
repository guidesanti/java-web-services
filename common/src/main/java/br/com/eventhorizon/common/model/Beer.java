package br.com.eventhorizon.common.model;

public class Beer {

  private String id;

  private String name;

  private String style;

  public Beer() {
  }

  public Beer(String id, String name, String style) {
    this.id = id;
    this.name = name;
    this.style = style;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Beer {");
    sb.append("id: " + id);
    sb.append(", name: " + name);
    sb.append(", style: " + style);
    sb.append("}");
    return sb.toString();
  }

}
