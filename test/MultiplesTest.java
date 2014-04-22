import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 22/04/14.
 */
public class MultiplesTest {

    @Test
    public void testIfANumberIsMultipleOf3() {
        Multiples multiples = new Multiples();
        assertEquals(true, multiples.isMultipleOfThreeOrFive(3) );
    }

    @Test
    public void testIfANumberIsMultipleOf5() {
        Multiples multiples = new Multiples();
        assertEquals(true, multiples.isMultipleOfThreeOrFive(5));
    }

    @Test
    public void testIfANumberIsNotMultipleOf3Or5() {
        Multiples multiples = new Multiples();
        assertEquals(false, multiples.isMultipleOfThreeOrFive(2));
    }

    @Test
    public void testWhatNumbersFrom1to5AreMultiplesOfThree() throws Exception {
        Multiples multiples = new Multiples();
        assertEquals(23, multiples.sumMultipleNumbersOfThreeAndFive(10));
    }
}
