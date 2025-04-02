package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testMethod1(){
        assertEquals(3.0, calculator.add(1,2), "Ergebnis für + ist 3");
        assertEquals(-1.0, calculator.subtract(1,2), "Ergebnis für - ist -1");
        assertEquals(0.5, calculator.divide(1,2), "Eregbnis für / ist 0.5");
        assertEquals(2.0, calculator.multiply(1,2), "Erebgnis für * ist 2");
    }

    @Test
    public void testMethod2(){
        assertEquals(4.0, calculator.add(2,2), "Ergebnis für + ist 4");
        assertEquals(0.0, calculator.subtract(2,2), "Ergebnis für - ist 0");
        assertEquals(1.0, calculator.divide(2,2), "Eregbnis für / ist 1");
        assertEquals(4.0, calculator.multiply(2,2), "Erebgnis für * ist 4");
    }

    @Test
    public void testMethod3() {
        assertEquals(4.0, calculator.add(2, 2), "Ergebnis für + ist 10");
        assertEquals(0.0, calculator.subtract(2, 2), "Ergebnis für - ist 10");
        assertEquals(1.0, calculator.divide(2, 2), "Division durch 0 nicht erlaubt (Es kommt 0 " +
                "zurück)");
        assertEquals(4.0, calculator.multiply(2, 2), "Erebgnis für * ist 0");
    }

    @Test
    public void testFactorialFor2(){
        assertEquals(2, calculator.factorial(2), "Fakultät von 2 sollte 2 sein");
    }

    @Test
    public void testFactorialForMinus3(){
        assertEquals(0, calculator.factorial(-3), "Fakultät von -3 sollte 0 sein");
    }

    @Test
    public void testFactorialForZero(){
        assertEquals(0, calculator.factorial(0),"Fakultät von 0 sollte 0 sein");
    }
}
