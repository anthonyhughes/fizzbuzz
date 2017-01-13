import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceGeneratorTest {

    @Test
    public void generatesAListOf100Elements(){
        assertEquals(100, new SequenceGenerator().getList().size());
    }

    @Test
    public void generatesSequenceFrom1To100(){
        long index = 1;
        for (long integer : new SequenceGenerator().getList()) {
            assertEquals(index++, integer);
        }
    }
}
