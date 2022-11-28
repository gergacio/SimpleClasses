import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    //define field (custom data type Calculator)
    Calculator calculator;
    //update calculator with new instance before each test
    @Before
    public void before(){
        calculator = new Calculator();
    }
    //write tests for Add, Subtract, Multiply, Divide.
    @Test
    public void add(){
        assertEquals(2,calculator.getAdd(1,1));
    }
    @Test
    public void subtract(){
        assertEquals(2,calculator.getSubtract(4,2));
    }
    @Test
    public void multiply(){
        assertEquals(9,calculator.getMultiply(3,3));
    }
    @Test
    public void divide(){
        assertEquals(33,calculator.getDivide(99,3),0.0);
    }





}
