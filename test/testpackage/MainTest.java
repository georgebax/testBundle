package testpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

   @Test
   void testSomething() {
       assertEquals(new Main("foo").getS(), "foo");
   }
   
}
