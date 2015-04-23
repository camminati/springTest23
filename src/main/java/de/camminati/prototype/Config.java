package de.camminati.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@ComponentScan
public class Config {
  @Bean
  MyBean myBean(){
    return new MyBean("new");
  }

  @Bean
  SubScope someOtherScope(){
    return new SubScope();
  }
}
