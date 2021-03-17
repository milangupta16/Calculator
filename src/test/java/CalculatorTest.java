import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest{

    private static final double DELTA = 1e-15;

    @Test
    public void sqrootTruePositive(){
       assertEquals("Square Root of a number for True Positive",4.0,Calculator.sqroot(16),DELTA);
       assertEquals("Square Root of a number for True Positive",3.0,Calculator.sqroot(9),DELTA);
       assertEquals("Square Root of a number for True Positive",1.0,Calculator.sqroot(1),DELTA);

    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Square Root of a number for False Positive",3,Calculator.sqroot(16),DELTA);
        assertNotEquals("Square Root of a number for False Positive",1.0,Calculator.sqroot(9),DELTA);
        assertNotEquals("Square Root of a number for False Positive",0,Calculator.sqroot(1),DELTA);

    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorial of a number for True Positive",120.0,Calculator.factorial(5),DELTA);
        assertEquals("Factorial of a number for True Positive",3628800.0,Calculator.factorial(10),DELTA);
        assertEquals("Factorial of a number for True Positive",1.0,Calculator.factorial(0),DELTA);

    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorial of a number for False Positive",110.0,Calculator.factorial(5),DELTA);
        assertNotEquals("Factorial of a number for False Positive",100000.0,Calculator.factorial(10),DELTA);
        assertNotEquals("Factorial of a number for False Positive",0.0,Calculator.factorial(0),DELTA);

    }

    @Test
    public void logTruePositive(){
        assertEquals("Log of a number for True Positive",2.302585092994046,Calculator.log(10),DELTA);
        assertEquals("Log of a number for True Positive",0.0,Calculator.log(1),DELTA);
        assertEquals("Log of a number for True Positive", 2.995732273553991,Calculator.log(20),DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Log of a number for False Positive",1.302585092994046,Calculator.log(10),DELTA);
        assertNotEquals("Log of a number for False Positive",1.0,Calculator.log(1),DELTA);
        assertNotEquals("Log of a number for False Positive", 2.9977732273553991,Calculator.log(20),DELTA);

    }

    @Test
    public void powerTruePositive(){
        assertEquals("Power of a number for True Positive",25.0,Calculator.power(5,2),DELTA);
        assertEquals("Power of a number for True Positive",512.0,Calculator.power(2,9),DELTA);
        assertEquals("Power of a number for True Positive", 1.0,Calculator.power(3,0),DELTA);

    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of a number for False Positive",25.9,Calculator.power(5,2),DELTA);
        assertNotEquals("Power of a number for False Positive",256.0,Calculator.power(2,9),DELTA);
        assertNotEquals("Power of a number for False Positive", 3.0,Calculator.power(3,0),DELTA);

    }


}