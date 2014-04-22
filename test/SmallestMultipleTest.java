import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by pchavez on 22/04/14.
 */
public class SmallestMultipleTest {
    @Test
    public void shouldBeOneWhenUpToOne(){
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(1, smallestMultiple.get(1));
    }
}
