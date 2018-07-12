package net.friend.expression;

import java.util.GregorianCalendar;
import net.friend.expression.Inventor;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MyExpression {

  public static void main(String[] args) {
    ExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression("'Hello World'");
    String message = (String) exp.getValue();
    System.out.println(message); // Hello World

    exp = parser.parseExpression("'Hello World'.concat('!')");
    message = (String) exp.getValue();
    System.out.println(message); // Hello World!

    exp = parser.parseExpression("new String('hello world').toUpperCase()");
    message = exp.getValue(String.class);
    System.out.println(message); // HELLO WORLD

    exp = parser.parseExpression("'Hello World'.bytes");
    byte[] bytes = (byte[]) exp.getValue();
    System.out.println(bytes.length);

    exp = parser.parseExpression("'Hello World'.bytes.length");
    int length = (Integer) exp.getValue();
    System.out.println(length);



    // Create and set a calendar
    GregorianCalendar c = new GregorianCalendar();
    c.set(1856, 7, 9);

    // The constructor arguments are name, birthday, and nationality.
    Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");

    parser = new SpelExpressionParser();

    exp = parser.parseExpression("name");
    String name = (String) exp.getValue(tesla);
    System.out.println(name);

    exp = parser.parseExpression("name == 'Nikola Tesla'");
    boolean result = exp.getValue(tesla, Boolean.class);
    System.out.println(result);
  }
}
