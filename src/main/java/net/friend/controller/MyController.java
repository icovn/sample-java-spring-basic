package net.friend.controller;

import lombok.extern.slf4j.Slf4j;
import net.friend.validator.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class MyController {

  @GetMapping("/convert")
  @ResponseBody
  public String convert(@RequestParam("person") Person person) {
    log.info("person {}", person);
    return person.toString();
  }

  @GetMapping("/")
  public String home(){
    log.info("I love dev-tool much, yes it's  true!");
    return "index";
  }
}
