import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceFiveWithBuzzTest {

    @Test
    public void replaceFiveWithBuzz(){
        assertEquals("Buzz", new ReplaceFiveWithBuzz().replace(5));
    }

    @Test
    public void replacesOnlyMultiplesOfFiveWithBuzz(){
        assertEquals("1", new ReplaceFiveWithBuzz().replace(1));

    }
}
