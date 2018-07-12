package net.friend.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToIntegerConverter implements Converter<String, Integer> {

  public Integer convert(String source) {
    return Integer.valueOf(source);
  }
}