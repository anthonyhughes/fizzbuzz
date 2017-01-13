import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by capi on 13/01/2017.
 */
public class ReplaceFifteenWithFizzBuzzTest {

    @Test
    public void fifteenIsFizzBuzz() {
        assertEquals("FizzBuzz", new ReplaceFifteenWithFizzBuzz().replace(15));

    }

    @Test
    public void oneIsOne() {
        assertEquals("1", new ReplaceFifteenWithFizzBuzz().replace(1));
    }

}