package beverages;

import junit.framework.TestCase;
import org.junit.Test;


public class cappuccinoTest extends TestCase {
    @Test
    public void cappuccinoTest() {
        cappuccino coffeeMachine = new cappuccino();

        assertTrue(coffeeMachine.water >= 1);
        assertTrue(coffeeMachine.milk >= 1);
        assertTrue(coffeeMachine.coffee >= 1);
        assertTrue(coffeeMachine.money >= 1);
        assertTrue(coffeeMachine.cups >= 1);
    }
}