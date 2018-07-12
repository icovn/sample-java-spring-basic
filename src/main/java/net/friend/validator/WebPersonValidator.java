package net.friend.validator;

import net.friend.Person;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class WebPersonValidator implements Validator {

  @Override
  public boolean supports(Class<?> aClass) {
    return Person.class.equals(aClass);
  }

  @Override
  public void validate(Object obj, Errors errors) {
    Person person = (Person) obj;
    if(person.getAge()  > 100){
      errors.reject("age", "Too old");
    }
  }

}
