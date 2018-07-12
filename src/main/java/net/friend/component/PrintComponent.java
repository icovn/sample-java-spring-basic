package net.friend.component;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrintComponent {

  @Autowired
  private Animal animal;

  private String name;

  public PrintComponent(){
    this.name = UUID.randomUUID().toString();
  }

  public void print(){
    System.out.println("Print name " + name + "|" + animal.hello());
  }
}
