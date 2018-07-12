package net.friend;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import lombok.extern.slf4j.Slf4j;
import net.friend.component.PrintComponent;
import net.friend.validator.PersonService;
import net.friend.validator.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.DataBinder;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }

  @Value("#{ systemProperties['os.name'] }")
  private String osName;

  @Autowired
  private MyConversionService myConversionService;

  @Autowired
  private PrintComponent printComponent;

  @Autowired
  private PrintComponent printComponent2;

  @Autowired
  private PrintComponent printComponent3;

  @Autowired
  private PersonService personService;

  @Override
  public void run(String... strings) {
//    myConversionService.testBuiltIn();

    System.out.println(osName);

//    printComponent.print();
//    printComponent2.print();
//    printComponent3.print();

    Person person = new Person("zz",  311);
    Person person2 = new Person("icovn",  10);

    personService.processPerson(person);
    personService.processPerson(person2);
  }
}
