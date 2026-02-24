import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calulator calulator = new Calulator();

    @Test
    void testAddMethod_positiveNumbers() {
        double result = calulator.addMethod(5.0, 3.0);
        assertEquals(8.0, result);
    }

    @Test
    void testAddMethod_negativeNumbers() {
        double result = calulator.addMethod(-5.0, -3.0);
        assertEquals(-8.0, result);
    }

    @Test
    void testAddMethod_withZero() {
        double result = calulator.addMethod(5.0, 0.0);
        assertEquals(5.0, result);
    }

    @Test
    void testSubtractMethod_positiveNumbers() {
        double result = calulator.subtractMethod(10.0, 4.0);
        assertEquals(6.0, result);
    }

    @Test
    void testSubtractMethod_negativeNumbers() {
        double result = calulator.subtractMethod(-10.0, -5.0);
        assertEquals(-5.0, result);
    }

    @Test
    void testSubtractMethod_resultNegative() {
        double result = calulator.subtractMethod(3.0, 5.0);
        assertEquals(-2.0, result);
    }
}