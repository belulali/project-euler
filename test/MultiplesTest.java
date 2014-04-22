import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 22/04/14.
 */
public class MultiplesTest {

    @Test
    public void testIfANumberIsMultipleOf3() {
        Multiples multiples = new Multiples();
        assertEquals(true, multiples.multipleOfThreeOrFive(3) );
    }

    @Test
    public void testIfANumberIsNotMultipleOf3() {
        Multiples multiples = new Multiples();
        assertEquals(false, multiples.multipleOfThreeOrFive(2));
    }

    @Test
    public void testIfANumberIsMultipleOf5() {
        Multiples multiples = new Multiples();
        assertEquals(true, multiples.multipleOfThreeOrFive(5));
    }
}
