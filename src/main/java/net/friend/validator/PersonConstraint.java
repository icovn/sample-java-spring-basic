package net.friend.validator;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PersonValidator.class)
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonConstraint {

  String message() default  "Age to old";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
