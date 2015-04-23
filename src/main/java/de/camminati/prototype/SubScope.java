package de.camminati.prototype;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class SubScope {

  @Autowired
  SubSubScope someSubScope;

  @Resource
  MyBean myBean;
}
