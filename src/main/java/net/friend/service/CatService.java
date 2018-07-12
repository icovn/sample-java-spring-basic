package net.friend.service;

import org.springframework.stereotype.Component;

@Component
public class CatService implements AnimalService {

  private int count;

  @Override
  public String hello() {
    return "I'm a cat " + count++;
  }
}
