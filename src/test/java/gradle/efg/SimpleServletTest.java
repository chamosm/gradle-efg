/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.efg;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class SimpleServletTest {
    @Test public void isServletMethodReturnsTrue() {
        SimpleServlet classUnderTest = new SimpleServlet();
        assertTrue(classUnderTest.isServlet(), "isServletMethod should return 'true'");
    }
}
