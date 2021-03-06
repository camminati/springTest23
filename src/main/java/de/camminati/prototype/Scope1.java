package de.camminati.prototype;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Scope("prototype")
@Component
@Getter
@Setter
public class Scope1 {

  @Autowired
  SubScope someOtherScope;

  @Autowired
  private MyBean myBean;

  @PostConstruct
  void init() {
    this.myBean.setName("scope1");
  }

  public void setSomething(String string){
    this.getMyBean().setName(string);
  }
}
