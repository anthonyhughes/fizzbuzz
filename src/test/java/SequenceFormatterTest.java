import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anthonyhughes on 13/01/2017.
 */
public class SequenceFormatterTest {

    @Test
    public void formatInteger() {
        assertEquals("0", new SequenceFormatter().format(0));
    }

    @Test
    public void formatIntegers() {
        assertEquals("0,1,2", new SequenceFormatter().format(0, 1, 2));
    }

}
