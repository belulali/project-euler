import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 22/04/14.
 */
public class MultiplesTest {

    @Test
    public void shouldCheckIfANumberIsMultipleOf3(){
        Multiples multiples = new Multiples();
        assertEquals(true, multiples.multipleOfThreeOrFive(3) );
    }
}
