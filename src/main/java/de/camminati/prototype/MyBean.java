package de.camminati.prototype;

public class MyBean implements MyBeanInterface{

  public String name;

  public MyBean(String aNew) {
    this.name = aNew;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
