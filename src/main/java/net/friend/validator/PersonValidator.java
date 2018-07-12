package net.friend.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersonValidator implements ConstraintValidator<PersonConstraint, Person> {

  @Override
  public boolean isValid(Person value, ConstraintValidatorContext context) {
    if(value.getAge() > 100){
      return false;
    }

    return true;
  }
}
