import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

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

    @Test
    public void shouldReturnTheFibonacciNumbersUntilFive() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        List<Integer> actualFibonacciNumbers = fibonacciNumbers.getFibonacciNumbers(6);
        Integer[] expectedFibonacciNumbers = {1, 2, 3, 5};
        assertArrayEquals(expectedFibonacciNumbers, actualFibonacciNumbers.toArray());
    }

    @Test
    public void shouldSumTheEvenNumbersOfTheFibonacciNumbersList() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        assertEquals(10, fibonacciNumbers.sumEvenFibonacciNumbers(10));


    }
}
