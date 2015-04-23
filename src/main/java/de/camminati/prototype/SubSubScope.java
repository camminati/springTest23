package de.camminati.prototype;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class SubSubScope {

  @Resource
  MyBean myBean;
}
