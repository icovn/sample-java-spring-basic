package net.friend.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrintService {

  @Autowired
  private AnimalService animalService;

  private String name;

  public PrintService(){
    this.name = UUID.randomUUID().toString();
  }

  public void print(){
    System.out.println("Print name " + name + "|" + animalService.hello());
  }
}
