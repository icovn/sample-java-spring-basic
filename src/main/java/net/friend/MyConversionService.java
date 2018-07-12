package net.friend;

import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class MyConversionService {

  private ConversionService conversionService;

  public MyConversionService(@Lazy ConversionService conversionService) {
    this.conversionService = conversionService;
  }

  public void testBuiltIn() {
    int myInteger = conversionService.convert("25", Integer.class);
    System.out.println(myInteger);

    Person person = conversionService.convert("icovn,26", Person.class);
    System.out.println(person);
  }
}
