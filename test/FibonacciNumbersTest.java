import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 23/04/14.
 */
public class FibonacciNumbersTest {

    @Test
    public void shouldReturnTrueIfANumberIsEven() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        assertEquals(true, fibonacciNumbers.isEven(2));
    }

    @Test
    public void shouldReturnFalseIfANumberIsEven() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        assertEquals(false, fibonacciNumbers.isEven(3));
    }

}
