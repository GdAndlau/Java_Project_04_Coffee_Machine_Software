package beverages;

import junit.framework.TestCase;
import org.junit.Test;

public class latteTest extends TestCase {
    @Test
    public void latteTest() {
        latte coffeeMachine = new latte();

        assertTrue(coffeeMachine.water >= 1);
        assertTrue(coffeeMachine.milk >= 1);
        assertTrue(coffeeMachine.coffee >= 1);
        assertTrue(coffeeMachine.money >= 1);
        assertTrue(coffeeMachine.cups >= 1);
    }
}