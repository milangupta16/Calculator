import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    Calculator calculator = new Calculator();
    public void testMain(){

    }

    @Test
    public void sqrootTruePositive(){
       assertEquals("Square Root of a number for True Positive",4.0,calculator.sqroot(16));
       assertEquals("Square Root of a number for True Positive",3.0,calculator.sqroot(9));
       assertEquals("Square Root of a number for True Positive",1.0,calculator.sqroot(1));

    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Square Root of a number for False Positive",3,calculator.sqroot(16));
        assertNotEquals("Square Root of a number for False Positive",1.0,calculator.sqroot(9));
        assertNotEquals("Square Root of a number for False Positive",0,calculator.sqroot(1));

    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorial of a number for True Positive",120.02,calculator.factorial(5));
        assertEquals("Factorial of a number for True Positive",3628800.0,calculator.factorial(10));
        assertEquals("Factorial of a number for True Positive",1.0,calculator.factorial(0));

    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorial of a number for False Positive",110.0,calculator.factorial(5));
        assertNotEquals("Factorial of a number for False Positive",100000.0,calculator.factorial(10));
        assertNotEquals("Factorial of a number for False Positive",0.0,calculator.factorial(0));

    }

    @Test
    public void logTruePositive(){
        assertEquals("Log of a number for True Positive",2.302585092994046,calculator.log(10));
        assertEquals("Log of a number for True Positive",0.0,calculator.log(1));
        assertEquals("Log of a number for True Positive", 2.995732273553991,calculator.log(20));

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Log of a number for False Positive",1.302585092994046,calculator.log(10));
        assertNotEquals("Log of a number for False Positive",1.0,calculator.log(1));
        assertNotEquals("Log of a number for False Positive", 2.9977732273553991,calculator.log(20));

    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power of a number for True Positive",25.0,calculator.power(5,2));
        assertEquals("Power of a number for True Positive",512.0,calculator.power(2,9));
        assertEquals("Power of a number for True Positive", 1.0,calculator.power(3,0));

    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of a number for False Positive",25.9,calculator.power(5,2));
        assertNotEquals("Power of a number for False Positive",256.0,calculator.power(2,9));
        assertNotEquals("Power of a number for False Positive", 3.0,calculator.power(3,0));

    }


}