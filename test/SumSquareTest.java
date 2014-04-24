import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 24/04/14.
 */
public class SumSquareTest {

    @Test
    public void shouldCalculateTheSumOfTheSquaresOfTheFirstTenNaturalNumbers() {
        SumSquare sumSquare = new SumSquare();
        assertEquals(385, sumSquare.sumSquareOfNumbersUntil(10));
    }

    @Test
    public void shouldCalculateTheSquareOfTheSumOfTheFirstTenNaturalNumbers() {
        SumSquare sumSquare = new SumSquare();
        assertEquals(3025, sumSquare.squareOfSumOfNumbersUntil(10));
    }

    @Test
    public void shouldCalculateTheDifferenceBetweenTheSumOfSquaresAndTheSquareOfTheSum() {
        SumSquare sumSquare = new SumSquare();
        assertEquals(2640, sumSquare.difference(10));
    }
}
