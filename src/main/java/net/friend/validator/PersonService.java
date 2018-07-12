package net.friend.validator;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import net.friend.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Slf4j
@Validated
public class PersonService {

  @Autowired
  private PersonValidator personValidator;
  public void processPerson(@Valid Person person){
    log.info("(processPerson) {}", person);
  }
}
