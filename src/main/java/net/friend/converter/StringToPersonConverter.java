package net.friend.converter;

import net.friend.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToPersonConverter implements Converter<String, Person> {


  @Override
  public Person convert(String from) {
    String[] data = from.split(",");
    return new Person(
        data[0],
        Integer.parseInt(data[1]));
  }
}
