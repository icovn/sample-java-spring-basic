package net.friend;

import lombok.extern.slf4j.Slf4j;
import net.friend.service.MyConversionService;
import net.friend.service.PrintService;
import net.friend.validator.Person;
import net.friend.validator.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
  private PrintService printService;

  @Autowired
  private PrintService printService2;

  @Autowired
  private PrintService printService3;

  @Autowired
  private PersonService personService;

  @Override
  public void run(String... strings) {
    System.out.println(osName);
  }

  private void testTypeConversion(){
    myConversionService.testBuiltIn();
  }

  private void testSingletonVsPrototype(){
    printService.print();
    printService2.print();
    printService3.print();
  }

  private void validatePersons(){
    Person person = new Person("zz",  311);
    Person person2 = new Person("icovn",  10);

    personService.processPerson(person);
    personService.processPerson(person2);
  }
}
