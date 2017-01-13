import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ReplaceMultiplesOfFiveWithBuzzTest {

    @Test
    @Parameters({"5, Buzz", "10, Buzz", "55, Buzz"})
    public void replaceMultiplesOfFiveWithBuzz(int number, String expectedOutput){
        assertEquals(expectedOutput, new ReplaceMultiplesOfFiveWithBuzz().replace(number));
    }

    @Test
    @Parameters({"6, 6", "11, 11", "56, 56"})
    public void doesNotReplaceNonMultiplesOfFive(int number, String exectedOutput){
        assertEquals(exectedOutput, new ReplaceMultiplesOfFiveWithBuzz().replace(number));

    }
}
