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

    @Test
    public void shouldBeTwoWhenUpToTwo(){
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(2, smallestMultiple.get(2));
    }

    @Test
    public void shouldBeSixWhenUpToThree(){
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(6, smallestMultiple.get(3));
    }

    @Test
    public void sixShouldBeDivisibleByThree(){
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(true, smallestMultiple.isDivisibleBy(6, 3));
    }
}
