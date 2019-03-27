package org.talents.examples.gradle;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;


public class App {

  private static Logger logger = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    logger.log(Level.INFO, "Begin main");

    App app = new App();
    app.testNullable("test with no nullable",null);

    app.testNullable("test with nullable", "nullable string");

  }

  public void testNullable(String testString, @Nullable String otherParam) {

    logger.log(Level.INFO, "Test string: " + testString);

    if(otherParam != null) {
      logger.log(Level.INFO,"nullable otherParam: " + otherParam);
    }
  }


}
