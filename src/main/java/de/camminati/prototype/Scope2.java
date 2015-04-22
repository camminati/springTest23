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
public class Scope2 {


  @Autowired
  SomeSubScope someOtherScope;

  @Autowired
  private MyBean myBean;

  @PostConstruct
  void init() {
    this.myBean.setName("scope2");
  }
}
