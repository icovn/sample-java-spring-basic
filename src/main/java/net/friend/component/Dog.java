package net.friend.component;

import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog implements Animal {

  private int count;

  private String name;

  public Dog(){
    this.name = UUID.randomUUID().toString();
  }

  @Override
  public String hello() {
    return name + ": I'm a dog " + count++;
  }
}
