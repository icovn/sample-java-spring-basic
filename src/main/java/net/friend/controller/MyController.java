package net.friend.controller;

import net.friend.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping("/convert")
  public String convert(@RequestParam("person") Person person) {
    System.out.println(person);
    return person.toString();
  }
}
