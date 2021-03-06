import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testAdd() {
        calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
    }

    @Test
    public void testSubstract() {
        calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
    }

    //@Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
        calculator.add(2);
        calculator.multiply(2);
        assertEquals(4,calculator.getResult());
        calculator.multiply(3);
        assertEquals(12,calculator.getResult());
    }

    @Test
    public void testDivide() {
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }

    @Test(timeout =1000)//1s
    public void testSquareRoot(){
        calculator.squareRoot(2);
        assertEquals(4,calculator.getResult());
    }



}
