package theCoffeeMachine;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TheMachineTest extends TestCase {

    public void testGetState() {
        TheMachine machine = new TheMachine(550, 400, 540, 120, 9);

        String expected = "The coffee machine has:\n" +
                "400 ml of water\n" +
                "540 ml of milk\n" +
                "120 g of coffee beans\n" +
                "9 disposable cups\n" +
                "$550 of money";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        machine.getState();

        assertEquals(expected, outContent.toString().trim());
    }

    public void testSetNewCoffeeMachineState() {
    }

    public void testSetMoney() {
    }

    public void testSetTheMachine() {
    }

    public void testIsMachineEmpty() {
    }
}