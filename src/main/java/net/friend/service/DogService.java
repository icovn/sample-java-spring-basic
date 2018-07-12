package net.friend.service;

import java.util.UUID;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("singleton")
public class DogService implements AnimalService {

  private int count;

  private String name;

  public DogService(){
    this.name = UUID.randomUUID().toString();
  }

  @Override
  public String hello() {
    return name + ": I'm a dog " + count++;
  }
}
