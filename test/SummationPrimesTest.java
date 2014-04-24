import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 24/04/14.
 */
public class SummationPrimesTest {

    @Test
    public void shouldCheckIfNumberIsPrime() {
        SummationPrimes summationPrimes = new SummationPrimes();
        assertEquals(true, summationPrimes.isPrime(5));
    }

    @Test
    public void shouldSumThePrimesBelowTen() {
        SummationPrimes summationPrimes = new SummationPrimes();
        assertEquals(17, summationPrimes.sumPrimesBelow(10));
    }
}
