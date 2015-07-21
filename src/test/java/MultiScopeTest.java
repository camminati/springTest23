import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.camminati.prototype.Config;
import de.camminati.prototype.MyBean;
import de.camminati.prototype.Scope1;
import de.camminati.prototype.Scope2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiScopeTest {


  @Test
  public void daTest(){
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    log.info("MyBean------------->{}",context.getBean(MyBean.class).getName());

    final Scope1 s1 = context.getBean(Scope1.class);
    s1.setSomething("something");
    log.info("Scope-1------------>{}", s1.getMyBean().getName());
    log.info("|-SubScope--------->{}", s1.getSomeOtherScope().getMyBean().getName());
    log.info("  |-SubSubScope---->{}", s1.getSomeOtherScope().getSomeSubScope().getMyBean().getName());

    final Scope2 s2 = context.getBean(Scope2.class);
    log.info("Scope-2------------>{}", s2.getMyBean().getName());
    log.info("|-SubScope--------->{}", s2.getSomeOtherScope().getMyBean().getName());
    log.info("  |-SubSubScope---->{}", s2.getSomeOtherScope().getSomeSubScope().getMyBean().getName());

  }

}
