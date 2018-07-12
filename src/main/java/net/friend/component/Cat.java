package net.friend.component;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Animal {

  private int count;

  @Override
  public String hello() {
    return "I'm a cat " + count++;
  }
}
