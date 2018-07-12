package net.friend.validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import net.friend.validator.PersonConstraint;

@Data
@PersonConstraint
public class Person {

  @NotNull
  @Size(max = 2, message = "WTF")
  private String name;

  @Min(value = 0, message = "ZZZZ")
  private int age;

  public Person(@Size(max = 2) String name, @Min(0) int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Person(Name: " + this.name + ", Age: " + this.age + ")";
  }
}
