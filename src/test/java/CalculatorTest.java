import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(4, 6);
    }

    @Test
    public void add() {
        assertEquals(10, calculator.add());
    }






}



