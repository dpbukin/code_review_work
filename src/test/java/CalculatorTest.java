import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(8, calculator.add(5,3));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5,3));
    }

    @Test
    void div() {
        try {
            assertEquals(0, calculator.div(4, 0));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage()
            );
        }
    }

    @Test
    void times() {
        assertEquals(15, calculator.times(5,3));
    }

    @Test
    void solver() {
        assertEquals(27, calculator.solver());

    }
}