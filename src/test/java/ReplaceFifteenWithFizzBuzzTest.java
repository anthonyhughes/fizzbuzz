import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by capi on 13/01/2017.
 */
public class ReplaceFifteenWithFizzBuzzTest {
    @Test
    public void fifteenIsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz(15));

    }
    @Test
    public void oneIsOne() {
        assertEquals("1", fizzBuzz(1));
    }

    private String fizzBuzz(int input) {
        return input % 15 == 0 ? "FizzBuzz" : input+"";
    }
}
