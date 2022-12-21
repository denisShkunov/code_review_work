import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        //TODO inser your realisation in test-method add
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void dif() {
        //TODO inser your realisation in test-method dif
        assertEquals(0,calculator.dif(5,5));
    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
        assertEquals(1,calculator.div(5,5));
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
        assertEquals(25,calculator.times(5,5));
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
        assertEquals(24,calculator.solver(5,5));
    }
}